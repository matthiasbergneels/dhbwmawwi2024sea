package lecture.chapter8;

import java.io.*;

public class WriteDataToFile {
    public static void main(String[] args) {
      File datei = new File(System.getProperty("user.dir") + "\\DemoLesen2.txt");
        FileWriter fw = null;

        // finally Variante
      try {
        fw = new FileWriter(datei);
        datei.createNewFile();
        fw.write("Dies ist eine Schreibdemo.");
        fw.write("Es werden mehrere Zeilen geschrieben.");
      }catch (IOException e) {
        System.out.println(e.getMessage());
      }finally {
        try {
          fw.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

        // try with-Ressource Variante
      try (FileWriter fw2 = new FileWriter(datei)){

        datei.createNewFile();
        fw2.write("Dies ist eine Schreibdemo.");
        fw2.write("Es werden mehrere Zeilen geschrieben.");
      }catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }
}
