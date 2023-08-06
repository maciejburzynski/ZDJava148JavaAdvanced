package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        How to create a file
        File file = new File("Test.txt");
        file.createNewFile();

//        Nadanie uprawnień
        file.setExecutable(true);
        file.setWritable(true);
        file.setReadable(true);

//        Ścieżka
        System.out.println("Path:");
        System.out.println(file.getAbsolutePath());

//        Writer
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("CocoJambo");
        fileWriter.append("Appending ByczQ!");
        fileWriter.close(); // Zawsze trzeba zamknąć

//        Reader
        FileReader fileReader = new FileReader(file);

        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }

        fileReader.close();

//        How to delete a file
        file.delete();
    }
}