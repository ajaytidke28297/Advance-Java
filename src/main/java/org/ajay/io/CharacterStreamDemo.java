package org.ajay.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("D:\\Java Projects\\Advance-Java\\source.txt");
            fileWriter = new FileWriter("D:\\Java Projects\\Advance-Java\\destination.txt");

            int content;
            while((content = fileReader.read()) != -1) {
                fileWriter.append((char) content);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}
