package DesignPattern.singletion.EnumSingleton;

public class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.getInstance();

        System.out.println(enumSingleton.getData() == enumSingleton.getData());

    }
}
