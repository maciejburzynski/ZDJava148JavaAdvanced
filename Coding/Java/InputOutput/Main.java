package InputOutput;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Jak utworzyć plik
        File file = new File("Test.txt");
        file.createNewFile();
        System.out.println(file.exists());

        file.setExecutable(true);
        file.setWritable(true);
        file.setReadable(true);

        System.out.println(file.getAbsolutePath());

        // Zapis do pliku
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Coco jambo");
        fileWriter.write(" Heja banana");
        fileWriter.close();

        // Odczyt z pliku
        FileReader fileReader = new FileReader(file);
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }
        fileReader.close();
    }}
