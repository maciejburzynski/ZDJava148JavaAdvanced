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

        System.out.println("Path where file is located: ");
        System.out.println(file.getAbsolutePath());

//      FileWriter - to write text to the file
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("CocoJambo ");
        fileWriter.append("Appending ByczQ!!");
//      I/O - important to close connection afterward of writing/reading
        fileWriter.close();

//      FileReader - to read text from the file
        FileReader fileReader = new FileReader(file);
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }
//      I/O - important to close connection afterward of writing/reading
        fileReader.close();


//      How to delete a file
//      file.delete();


//        FileInputStream in = new FileInputStream("user.txt");
//        FileOutputStream out = new FileOutputStream("user_output.txt");
//        int c;
//        while ((c = in.read()) != -1) {
//            out.write(c);
//        }


    }
}
