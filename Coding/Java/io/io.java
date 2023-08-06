package io;

import java.io.File;
import java.io.IOException;

public class io {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        file.createNewFile();


    }



}
