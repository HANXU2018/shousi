package Thread.jiaoti;

public class UseSynchronized {
    static class Number{
        public int num = 1;
        Number(){}
    }
    public static Number number = new Number();

    /*
    两个线程，线程1打印A，线程2打印B,两个线程同时并发，要求保证先打印A,后打印B
    使用synchronized+ wait、notify
     */
    public static void main(String[] args) {
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(number){
                    try{
                        while (number.num == 2)number.wait();;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("A");
                    number.num = 2;
                    number.notify();
                }
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(number){
                    try {
                        while (number.num == 1 )number.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("B");
                    number.num = 1;
                    number.notify();
                }
            }
        });
        b.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.start();
    }
}
