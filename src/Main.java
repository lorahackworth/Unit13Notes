public class Main {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        //writing start calls run() within threads
        //weird but ok
        t1.start();
        t2.start();
    }
}
class Hi implements Runnable{
    public void run(){
        /*for (int i = 0; i < 4; i++) {
            System.out.println("Whopper");
            try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        }
        System.out.println("Junior");
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        System.out.println("Double");
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        System.out.println("Triple");
        try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        System.out.println("Whopper");*/

        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        }
    }
}

class Hello implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}

        }
    }
}