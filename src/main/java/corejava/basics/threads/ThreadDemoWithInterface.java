package corejava.basics.threads;


public class ThreadDemoWithInterface {
    public static void main(String[] args) {
        Runnable hi = new Hi1();
        Runnable hello = new Hello1();

        new Thread(hi).start();
        new Thread(hello).start();
    }
}

class Hi1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi1");
            try {Thread.sleep(500);} catch (Exception exception) {}
        }
    }
}

class Hello1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello1");
            try {Thread.sleep(500);} catch (Exception exception) {}
        }
    }
}



//implements runnable
