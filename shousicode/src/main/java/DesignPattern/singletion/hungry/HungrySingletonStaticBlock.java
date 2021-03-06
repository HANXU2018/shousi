package DesignPattern.singletion.hungry;

public class HungrySingletonStaticBlock {
    private static final HungrySingletonStaticBlock single;
    static {
        single = new HungrySingletonStaticBlock();
    }
    private HungrySingletonStaticBlock(){

    }

    public static HungrySingletonStaticBlock getInstance(){
        return single;
    }

    void test(){
        System.out.println("hello ");
    }

    public static void main(String[] args) {
        HungrySingletonStaticBlock singleton = HungrySingletonStaticBlock.getInstance();
        singleton.test();
    }
}
