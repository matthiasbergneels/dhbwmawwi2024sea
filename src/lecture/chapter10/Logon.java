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

  // Implementierung als Singleton (Singleton-Pattern)
  private static Logon singleLogonInstance = null;
  private static final Map<String, String> USER_LIST;

  public static enum PROTOCOLS{
    FTP,
    SSH,
    HTTP,
    HTTPS
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

    ItemListener comboBoxListener = new ItemListener(){
      public void itemStateChanged(ItemEvent e) {
        System.out.println("itemStateChanged");
        System.out.println("Aktuelles Item: " + e.getItem());
        System.out.println("Änderungszustand: " + e.getStateChange());
        System.out.println("Parameter String: " + e.paramString());
        if(e.getStateChange() == ItemEvent.SELECTED) {
          switch(e.getItem().toString()){
            case "FTP":
              portField.setText("21");
              break;
            case "SSH":
              portField.setText("22");
          }
        }
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
    JButton okButton = new JButton("Ok");
    okButton.setName("OK_BUTTON");
    JButton cancelButton = new JButton("Beenden");
    cancelButton.setName("CANCEL_BUTTON");
    JButton printButton = new JButton("Ausgabe");
    printButton.setName("PRINT_BUTTON");

    ActionListener buttonListener = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Parameter String: " + e.paramString());
        System.out.println("Action Command: " + e.getActionCommand());
        System.out.println("Modifiers: " + e.getModifiers());
        System.out.println("Timestamp: " + e.getWhen());


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

    // set JFrame behavior
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) throws ParseException, UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

    // Set cross-platform Java L&F (also called "Metal")
    //System.out.println(UIManager.getLookAndFeel());
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