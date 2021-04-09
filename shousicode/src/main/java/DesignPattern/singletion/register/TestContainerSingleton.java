package DesignPattern.singletion.register;

public class TestContainerSingleton {

    public static void main(String[] args) {
        MyObject myObject1 = (MyObject) ContainerSingleton.getBean("DesignPattern.singletion.register.MyObject");
        MyObject myObject2 = (MyObject) ContainerSingleton.getBean("DesignPattern.singletion.register.MyObject");

        //上面返回 true 是因为我们加了 synchronized 关键字，
        // 实际上 Spring 框架中用的就是容器式单例，
        // 默认是线程不安全的

        System.out.println(myObject1 == myObject2);
    }

}
