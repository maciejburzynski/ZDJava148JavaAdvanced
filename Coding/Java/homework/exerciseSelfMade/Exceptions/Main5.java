package homework.exerciseSelfMade.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {
    public static void main(String[] args) throws IOException {

        FileReader in = null;


        try {
            in = new FileReader("Text.txt");

            int v = 0;
            while ((v = in.read()) != -1) {
                System.out.println((char) v);
            }

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException f){
            f.printStackTrace();
        }finally{
                if(in!=null)in.close();
            }

    }
}
