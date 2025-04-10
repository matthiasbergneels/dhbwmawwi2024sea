package lecture.chapter10;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Logon extends JFrame {

  private static final String ACTION_LOGIN = "LOGIN";
  private static final String ACTION_CLOSE = "CLOSE";
  private static final String ACTION_PRINT = "PRINT";

  // Implementierung als Singleton (Singleton-Pattern)
  private static Logon singleLogonInstance = null;
  private static final Map<String, String> USER_LIST;

  public static enum PROTOCOLS{
    FTP(21),
    SSH(22),
    HTTP(80),
    HTTPS(443);

    private int defaultPort;

    PROTOCOLS(int defaultPort){
      this.defaultPort = defaultPort;
    }

    public int getDefaultPort(){
      return defaultPort;
    }

    @Override
    public String toString() {
      switch(this){
        case HTTPS:
          return "HTTP(s) (" + getDefaultPort() + ")";
        default:
          return super.toString() +  " (" + getDefaultPort() + ")";
      }
    }
  }


  static {
    USER_LIST = new HashMap<>();

    USER_LIST.put("admin", "SuperAdmin");
    USER_LIST.put("user", "SuperUser");
    USER_LIST.put("teacher", "SuperTeacher");

  }


  public static Logon getSingleLogonInstance() throws ParseException {
    if(singleLogonInstance == null) {
      singleLogonInstance = new Logon();
    }
    return singleLogonInstance;
  }

  // Instanzattribute
  private final JFormattedTextField portField;

  private Logon() throws ParseException {
    super();
    this.setTitle("Logon");
    this.setAlwaysOnTop(true);
    this.setName("Logon");
    this.setResizable(false);

    JComboBox<PROTOCOLS> myComboBox = new JComboBox<>(PROTOCOLS.values());

    portField = new JFormattedTextField(new MaskFormatter("#####"));
    portField.setName("PORT_INPUTFIELD");
    portField.setColumns(3);

    /*
    ItemListener comboBoxListener = new ItemListener(){
      public void itemStateChanged(ItemEvent e) {
        System.out.println("itemStateChanged");
        System.out.println("Aktuelles Item: " + e.getItem());
        System.out.println("Änderungszustand: " + e.getStateChange());
        System.out.println("Parameter String: " + e.paramString());
        if(e.getStateChange() == ItemEvent.SELECTED) {
          portField.setText("" + ((PROTOCOLS)e.getItem()).getDefaultPort());
        }
      }
    };
     */
    ItemListener comboBoxListener = (e) -> {
      if(e.getStateChange() == ItemEvent.SELECTED) {
        portField.setText("" + ((PROTOCOLS)e.getItem()).getDefaultPort());
      }
    };

    myComboBox.addItemListener(comboBoxListener);

    // initialize Panels
    JPanel mainPanel = new JPanel(new BorderLayout());

    JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JPanel southPanel = new JPanel(new FlowLayout());
    JPanel centerPanel = new JPanel(new FlowLayout());


    JPanel connectionPanel = new JPanel(new GridLayout(0, 2));
    JPanel filePanel = new JPanel(new GridLayout(0, 2));

    FlowLayout cellFlowLayout = new FlowLayout(FlowLayout.LEFT);

    // Message Area
    JLabel messageTextLabel = new JLabel("");
    northPanel.add(messageTextLabel);

    //create & assign elements for connection area
    JPanel flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("User:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    JTextField userNameField = new JTextField(3);
    flowLayoutForCell.add(userNameField);
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Passwort:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    JPasswordField userPasswordField = new JPasswordField(3);
    flowLayoutForCell.add(userPasswordField);
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Art:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(myComboBox);
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Host:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    JTextField host = new JTextField(5);
    flowLayoutForCell.add(host);
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Port:"));
    connectionPanel.add(flowLayoutForCell);
    connectionPanel.add(portField);

    // create & add Fields for File Area
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Quelle:"));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JTextField(10));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Ziel:"));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JTextField(10));
    filePanel.add(flowLayoutForCell);

    // create & assign Buttons
    JButton okButton = new JButton("Login");
    okButton.setActionCommand(ACTION_LOGIN);
    okButton.setName("OK_BUTTON");
    JButton cancelButton = new JButton("Beenden");
    cancelButton.setActionCommand(ACTION_CLOSE);
    cancelButton.setName("CANCEL_BUTTON");
    JButton printButton = new JButton("Ausgabe");
    printButton.setActionCommand(ACTION_CLOSE);
    printButton.setName("PRINT_PRINT");

    /*
    ActionListener buttonListener = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Parameter String: " + e.paramString());
        System.out.println("Action Command: " + e.getActionCommand());
        System.out.println("Modifiers: " + e.getModifiers() + " " + Integer.toBinaryString(e.getModifiers()));
        System.out.println("Timestamp: " + e.getWhen());

        System.out.println("Umschalttaste: " + Integer.toBinaryString(ActionEvent.SHIFT_MASK));
        System.out.println("Steuerungstaste: " + Integer.toBinaryString(ActionEvent.CTRL_MASK));

        if((e.getModifiers() & ActionEvent.META_MASK) ==  ActionEvent.META_MASK) {
          System.out.println("CommandKey / WindowsKey wurde gedrückt");
        }else {
          System.out.println("CommandKey / WindowsKey wurde NICHT gedrückt!");
        }

        if(e.getActionCommand().equals("Beenden")) {
          System.exit(0);
        }else if(e.getActionCommand().equals("Ok")) {
          // Login Routine
          String userName = userNameField.getText();
          String passWord = userPasswordField.getText();

          String messageText = "";
          if(passWord.equals(USER_LIST.get(userName))) {
            messageText = "Erfolgreich eingeloggt! :>";
          } else {
            messageText = "Login fehlgeschlagen! :<";
          }
          messageTextLabel.setText(messageText);
        }

      }
    };
     */

    ActionListener buttonListener = (e) -> {
      System.out.println("Parameter String: " + e.paramString());
      System.out.println("Action Command: " + e.getActionCommand());
      System.out.println("Modifiers: " + e.getModifiers() + " " + Integer.toBinaryString(e.getModifiers()));
      System.out.println("Timestamp: " + e.getWhen());

      System.out.println("Umschalttaste: " + Integer.toBinaryString(ActionEvent.SHIFT_MASK));
      System.out.println("Steuerungstaste: " + Integer.toBinaryString(ActionEvent.CTRL_MASK));

      if((e.getModifiers() & ActionEvent.META_MASK) ==  ActionEvent.META_MASK) {
        System.out.println("CommandKey / WindowsKey wurde gedrückt");
      }else {
        System.out.println("CommandKey / WindowsKey wurde NICHT gedrückt!");
      }

      if(e.getActionCommand().equals(ACTION_CLOSE)) {
        System.exit(0);
      }else if(e.getActionCommand().equals(ACTION_LOGIN)) {
        // Login Routine
        String userName = userNameField.getText();
        String passWord = userPasswordField.getText();

        String messageText = "";
        if(passWord.equals(USER_LIST.get(userName))) {
          messageText = "Erfolgreich eingeloggt! :>";
        } else {
          messageText = "Login fehlgeschlagen! :<";
        }
        messageTextLabel.setText(messageText);
      }
    };


    cancelButton.addActionListener(buttonListener);
    printButton.addActionListener(buttonListener);
    okButton.addActionListener(buttonListener);

    southPanel.add(okButton);
    southPanel.add(cancelButton);
    southPanel.add(printButton);

    // create & assign Borders
    Border etchedBorder = BorderFactory.createEtchedBorder();
    Border connectionBorder = BorderFactory.createTitledBorder(etchedBorder, "Verbindung");
    Border fileBorder = BorderFactory.createTitledBorder(etchedBorder, "Datei");
    Border centerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);

    connectionPanel.setBorder(connectionBorder);
    filePanel.setBorder(fileBorder);
    centerPanel.setBorder(centerBorder);

    // combine Panels
    centerPanel.add(connectionPanel);
    centerPanel.add(filePanel);

    mainPanel.add(northPanel, BorderLayout.NORTH);
    mainPanel.add(centerPanel, BorderLayout.CENTER);
    mainPanel.add(southPanel, BorderLayout.SOUTH);

    this.add(mainPanel);

    // MouseListener
    MouseListener mouseListener = new MouseListener() {

      @Override
      public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked UI Component " + ((JButton)e.getSource()).getName());
      }

      @Override
      public void mousePressed(MouseEvent e) {
        System.out.println("Pressed UI Component " + ((JButton)e.getSource()).getName());
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        System.out.println("Released UI Component " + ((JButton)e.getSource()).getName());
      }

      @Override
      public void mouseEntered(MouseEvent e) {
        System.out.println("Entered UI Component " + ((JButton)e.getSource()).getName());
      }

      @Override
      public void mouseExited(MouseEvent e) {
        System.out.println("Exit UI Component " + ((JButton)e.getSource()).getName());
      }
    };

    okButton.addMouseListener(mouseListener);
    cancelButton.addMouseListener(mouseListener);
    printButton.addMouseListener(mouseListener);

    // JMenuBar (Swing)

    JMenuBar frameMenuBar = new JMenuBar();

    this.setJMenuBar(frameMenuBar);

    JMenu fileMenu = new JMenu("Allgemein");

    frameMenuBar.add(fileMenu);

    JMenuItem loginMenuItem = new JMenuItem("Einloggen");
    loginMenuItem.setActionCommand(ACTION_LOGIN);
    loginMenuItem.addActionListener(buttonListener);
    JMenuItem exitMenuItem = new JMenuItem("Schließen");
    exitMenuItem.setActionCommand(ACTION_CLOSE);
    exitMenuItem.addActionListener(buttonListener);

    fileMenu.add(loginMenuItem);
    fileMenu.addSeparator();
    fileMenu.add(exitMenuItem);


    // AWT MenuBar
    MenuBar menuBar = new MenuBar();
    this.setMenuBar(menuBar);

    Menu fileAwtMenu = new Menu("Allgemein");
    menuBar.add(fileAwtMenu);

    MenuItem loginAwtMenuItem = new MenuItem("Einloggen");
    loginAwtMenuItem.setActionCommand(ACTION_LOGIN);
    loginAwtMenuItem.addActionListener(buttonListener);
    MenuItem closeAwtMenuItem = new MenuItem("Schliessen");
    closeAwtMenuItem.setActionCommand(ACTION_CLOSE);
    closeAwtMenuItem.addActionListener(buttonListener);

    fileAwtMenu.add(loginAwtMenuItem);
    fileAwtMenu.addSeparator();
    fileAwtMenu.add(closeAwtMenuItem);

    // set JFrame behavior
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) throws ParseException, UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

    // Set cross-platform Java L&F (also called "Metal")
    System.out.println(UIManager.getLookAndFeel());
    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    //System.out.println(UIManager.getLookAndFeel());

    GraphicsDevice defaultScreenDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

    System.out.println(String.format("Screen Dimension: %.0f x %.0f",
      defaultScreenDevice.getDefaultConfiguration().getBounds().getWidth(),
      defaultScreenDevice.getDefaultConfiguration().getBounds().getHeight()));

    Logon currentLogonScreen = getSingleLogonInstance();

    GraphicsEnvironment virtualGraphicsEvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] screens = virtualGraphicsEvironment.getScreenDevices();
  }

}