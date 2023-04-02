package multifil;


class MyRunnable implements Runnable {
    private int sleepTime;

    public MyRunnable(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            try {
                System.out.println("Thread " + Thread.currentThread().getName() + " iteración: " + i);
                Thread.sleep(sleepTime * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}