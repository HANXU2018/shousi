package DesignPattern.singletion.register;

import java.io.ObjectInput;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
    private ContainerSingleton(){

    }
    private static Map<String,Object> ioc = new ConcurrentHashMap<>();
//    存储单例对象
    public static Object getBean(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className,obj);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return obj;
            }
            return ioc.get(className);//如果容器中已经存在了单例对象，则直接返回
        }
    }

}
