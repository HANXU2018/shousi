package DesignPattern.singletion.EnumSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestEnumSingleton1 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazzz = EnumSingleton.class;
       // Constructor c1 = clazzz.getDeclaredConstructor();
       Constructor c2 = clazzz.getDeclaredConstructor(String.class,int.class);
       c2.setAccessible(true);
       // JDK 底层在保护我们的枚举类不允许被反射创建
      //  System.out.println(c2.newInstance("测试",666));
//        System.out.println(c1.newInstance());

        /*
        @CallerSensitive
    public T newInstance(Object ... initargs)
        throws InstantiationException, IllegalAccessException,
               IllegalArgumentException, InvocationTargetException
    {
        if (!override) {
            if (!Reflection.quickCheckMemberAccess(clazz, modifiers)) {
                Class<?> caller = Reflection.getCallerClass();
                checkAccess(caller, clazz, null, modifiers);
            }
        }
        if ((clazz.getModifiers() & Modifier.ENUM) != 0)
            throw new IllegalArgumentException("Cannot reflectively create enum objects");
        ConstructorAccessor ca = constructorAccessor;   // read volatile
        if (ca == null) {
            ca = acquireConstructorAccessor();
        }
        @SuppressWarnings("unchecked")
        T inst = (T) ca.newInstance(initargs);
        return inst;
    }
         */

    }
}
