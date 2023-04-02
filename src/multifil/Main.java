package multifil;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(1));
        Thread thread2 = new Thread(new MyRunnable(2));
        MyThread thread3 = new MyThread(3);
        MyThread thread4 = new MyThread(4);
        MyThread thread5 = new MyThread(5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}

