package io;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

//      How to create a File
        File file = new File("Test.txt");
        file.createNewFile();


        file.setExecutable(true);
        file.setWritable(true);
        file.setReadable(true);

        System.out.println("Path: ");
        System.out.println(file.getAbsolutePath());

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("CocoJambo ");
        fileWriter.append("Appending ByczQ!!");
        fileWriter.close();


        FileReader fileReader = new FileReader(file);

        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }
        fileReader.close();


//      How to delete a file
//        file.delete();


//        FileInputStream in = new FileInputStream("user.txt");
//        FileOutputStream out = new FileOutputStream("user_output.txt");
//        int c;
//        while ((c = in.read()) != -1) {
//            out.write(c);
//        }


    }
}
