package DesignPattern.singletion.lazy;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public void test(){
        System.out.println(Thread.currentThread().getName()+" hello "+this.toString());
    }

    public static  LazySingleton getInstance(){
        if(null == lazySingleton){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        lazySingleton1.test();
    }
}

