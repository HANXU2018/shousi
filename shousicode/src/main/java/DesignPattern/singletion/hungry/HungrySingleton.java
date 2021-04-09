package DesignPattern.singletion.hungry;

public class HungrySingleton {
    private static final HungrySingleton single = new HungrySingleton();
    private  HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return single;
    }

    void test(){
        System.out.println("hello ");
    }

    public static void main(String[] args) {
        HungrySingleton singleton = HungrySingleton.getInstance();
        singleton.test();
    }
}
