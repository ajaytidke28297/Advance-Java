package org.ajay.serializable;

import java.io.*;

public class SerDeserDemo {

    public static void main(String[] args) {
        Student student = new Student("John", 25, "23 East, California");

        String filename = "D:\\Java Projects\\Advance-Java\\Test.txt";
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;

        //Serialization
        try {
            fileOutputStream = new FileOutputStream(filename);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Object has been serialized: " + student);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Deserialization
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;

        try {
            fileInputStream = new FileInputStream(filename);
            objectInputStream = new ObjectInputStream(fileInputStream);

            Student object = (Student) objectInputStream.readObject();
            System.out.println("Object has been deserialized: " + object);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

    }
}
