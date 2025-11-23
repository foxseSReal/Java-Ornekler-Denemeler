package LEVEL_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Soru1 {

    public static void main(String[] args) throws IOException { // Exception handling main metoduna taşındı
        File currentDir = new File("."); // Bulunduğu klasör
        File[] files = currentDir.listFiles();

        if (files == null) {
            System.out.println("Klasör okunamadı.");
            return;
        }

        boolean found = false;

        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                System.out.println("Dosya: " + file.getName());
                System.out.println("-----------");

                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close(); // try-with-resources kullanılmadığı için manuel kapatma

                found = true;
                break; // Sadece ilk bulunan metin belgesini göster
            }
        }
        if (!found) {
            System.out.println(".txt uzantılı dosya bulunamadı.");
        }
    }
}
