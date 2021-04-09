package DesignPattern.singletion.EnumSingleton;

import sun.dc.pr.PRError;

public enum EnumSingleton {
    INSTANCE;

    private MyObject myObject;

    EnumSingleton(){
        this.myObject = new MyObject();

    }

    public  Object getData(){
        return myObject;
    }

    public static  EnumSingleton getInstance(){
        return  INSTANCE;
    }
}
