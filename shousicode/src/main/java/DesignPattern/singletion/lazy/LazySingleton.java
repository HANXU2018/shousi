package DesignPattern.singletion.lazy;

/*
一个是 lazySingleton 属性上加了 volatile 关键字来修饰，
原因就是解决多线程下的可见性问题，
因为我们的 getInstance 方法在判断 lazySingleton 是否为 null 时候并没有加锁，
所以假如线程 t1 初始化过了对象，另外线程如 t2 是无法感知的，
而加上了 volatile 就可以感知到。

另一个改变就是把 synchronized 关键字移到了方法内部，
尽可能缩小加锁的代码块，
提升效率。
 */
public class LazySingleton {
    private volatile static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public void test(){
        System.out.println(Thread.currentThread().getName()+" hello "+this.toString());
    }

    public static  LazySingleton getInstance(){
        if(null == lazySingleton){
            synchronized (LazySingleton.class){
                if(null == lazySingleton){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        lazySingleton1.test();
    }
}

