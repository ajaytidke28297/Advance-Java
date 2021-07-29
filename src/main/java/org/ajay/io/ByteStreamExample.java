package org.ajay.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("D:\\Java Projects\\Advance-Java\\source.txt");
            fileOutputStream = new FileOutputStream("D:\\Java Projects\\Advance-Java\\destination.txt");

            //reads a byte at a time, if it reached end of the file, returns -1
            int content;
            while((content = fileInputStream.read()) != -1) {
                fileOutputStream.write((byte) content);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }

    }
}
