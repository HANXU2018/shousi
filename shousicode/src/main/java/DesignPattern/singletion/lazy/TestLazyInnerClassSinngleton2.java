package DesignPattern.singletion.lazy;

import java.io.*;

public class TestLazyInnerClassSinngleton2 {
    public static void main(String[] args) {
        LazyInnerClassSingleton s1 = null;
        LazyInnerClassSingleton s2 = LazyInnerClassSingleton.getInstance();

        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("LazyInnerClassSingleton.text");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("LazyInnerClassSingleton.text");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (LazyInnerClassSingleton) ois.readObject();
            ois.close();

            System.out.println(s1 == s2);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
