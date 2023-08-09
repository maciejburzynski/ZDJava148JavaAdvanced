package homework.exercise6.garbage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        String filePath = "C:\\Users\\przem\\IdeaProjects\\ZDJava148JavaAdvanced3\\Coding\\Java\\homework\\exercise6\\garbage";
        String fileName = "myNumbers.txt";

        File file = new File(filePath + fileName);
        file.createNewFile();


        file.setExecutable(true);
        file.setWritable(true);
        file.setReadable(true);


        try {

            FileWriter fileWriter = new FileWriter(file);

            for (int i = 0; i < 100; i++) {
                fileWriter.write(Integer.toString(i) + " ");
            }
            fileWriter.close();
            System.out.println("File saved succsesfuly!");
        } catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}