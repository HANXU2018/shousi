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
    private Object readResolve(){
        return InnerLazy.innerSingleton;
    }

    public static void main(String[] args) {
        LazyInnerClassSingleton.getInstance().test();
    }
}
