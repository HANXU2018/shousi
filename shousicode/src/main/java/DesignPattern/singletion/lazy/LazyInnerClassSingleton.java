package DesignPattern.singletion.lazy;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){

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
    public static void main(String[] args) {
        LazyInnerClassSingleton.getInstance().test();
    }
}