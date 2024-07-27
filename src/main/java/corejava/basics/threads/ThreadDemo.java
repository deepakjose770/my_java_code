package corejava.basics.threads;

public class ThreadDemo {
    public static void main(String[] args) {
        Hi hi = new Hi();
        hi.start();
        Hello hello = new Hello();
        hello.start();
    }
}

class Hi extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {Thread.sleep(500);} catch (Exception exception) {}
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {Thread.sleep(500);} catch (Exception exception) {}
        }
    }
}



//implements runnable
