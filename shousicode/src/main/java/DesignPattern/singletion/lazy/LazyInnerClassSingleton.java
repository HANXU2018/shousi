package DesignPattern.singletion.lazy;

import java.io.Serializable;

public class LazyInnerClassSingleton implements Serializable {

    private LazyInnerClassSingleton() {
        //防止反射破坏单例
        if(null != InnerLazy.innerSingleton){
            throw  new RuntimeException("//防止反射破坏单例");
        }
    }

    public static LazyInnerClassSingleton getInstance(){
        return InnerLazy.innerSingleton;
    }

    private static class InnerLazy{
        private static final LazyInnerClassSingleton innerSingleton = new LazyInnerClassSingleton();

    }

    public void  test(){
        System.out.println(Thread.currentThread().getName()+" " + this.toString());
    }
    /*
    序列化没有破坏单例了。
    原因是因为 JDK 源码中在序列化的时候
    会检验一个类中是否存在一个 readResolve 方法，
    如果存在，
    则会放弃通过序列化产生的对象，
    而返回原本的对象。
     */
    private Object readResolve(){
        return InnerLazy.innerSingleton;
    }
    /*
    这种方式虽然保证了单例，
    但是在校验是否存在 readResolve 方法前还是会产生一个对象，
    只不过这个对象会在发现类中存在 readResolve 方法后丢掉，
    然后返回原本的单例对象。
    这种写法只是保证了结果的唯一，
    但是过程中依然会被实例化多次，
    假如创建对象的频率增大，
    就意味着内存分配的开销也随之增大。
     */

    public static void main(String[] args) {
        LazyInnerClassSingleton.getInstance().test();
    }
}
