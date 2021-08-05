package org.ajay.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class NioExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Java Projects\\Advance-Java\\Test.txt");
            FileChannel fileChannel = fileInputStream.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            int result = fileChannel.read(byteBuffer);
            System.out.println("file read sucessfully" + result);

            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Java Projects\\Advance-Java\\destination.txt");
            FileChannel writeChannel = fileOutputStream.getChannel();
            ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
            String message = "This is a test String";
            writeBuffer.put(message.getBytes(StandardCharsets.UTF_8));
            writeBuffer.flip();
            writeChannel.write(writeBuffer);
            System.out.println("File written successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
