package DesignPattern.singletion.hungry;
/*
* 饿汉式单例的优缺点
优点：创建对象时没有加任何的锁、执行效率比较高。
缺点：也很明显，
* 因为其在类加载的时候就初始化了，
* 也就是说不管我们用或者不用都占着空间，
* 如果项目中有大量单例对象，
* 则可能会浪费大量内存空间。
* */
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
