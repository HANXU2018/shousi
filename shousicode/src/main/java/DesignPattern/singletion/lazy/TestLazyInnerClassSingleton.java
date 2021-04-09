package DesignPattern.singletion.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestLazyInnerClassSingleton {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        //利用反射来破坏单例
        Class<?> lazyInnerClassSingletonClass = LazyInnerClassSingleton.class;
        Constructor constructor = lazyInnerClassSingletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o1 = constructor.newInstance();
        Object o2 = LazyInnerClassSingleton.getInstance();

        System.out.println(o1 == o2);


    }
}
