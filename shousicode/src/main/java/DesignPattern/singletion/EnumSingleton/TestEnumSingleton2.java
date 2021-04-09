package DesignPattern.singletion.EnumSingleton;

import java.io.*;

public class TestEnumSingleton2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EnumSingleton enumSingleton1 = null;
        EnumSingleton enumSingleton2 = EnumSingleton.getInstance();

        FileOutputStream fileOutputStream = new FileOutputStream("EnumSingleton.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(enumSingleton2);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("EnumSingleton.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        enumSingleton1 = (EnumSingleton)objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();

        System.out.println(enumSingleton1 == enumSingleton2);

    }
}
