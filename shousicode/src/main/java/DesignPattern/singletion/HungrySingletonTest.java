package DesignPattern.singletion;

public class HungrySingletonTest {
    public static void main(String[] args) {
        HungrySingleton singleton1 = HungrySingleton.getInstance();
        HungrySingleton singleton2 = HungrySingleton.getInstance();

        singleton1.test();
        singleton2.test();
        System.out.println(singleton1.equals(singleton2));

        HungrySingletonStaticBlock singleton3 = HungrySingletonStaticBlock.getInstance();
        HungrySingletonStaticBlock singleton4 = HungrySingletonStaticBlock.getInstance();

        singleton3.test();
        singleton4.test();

        System.out.println(singleton3==singleton4);
    }
}
