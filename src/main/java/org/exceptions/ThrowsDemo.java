package org.exceptions;

import java.io.*;

public class ThrowsDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\Downloads\\fileInput.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
    }
}
