package DesignPattern.singletion.thread;

public class TestThreadLocalSingleton {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(()->{
            ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
            System.out.println(Thread.currentThread().getName()+" : " + singleton);
        });

        t1.start();
    }
}
