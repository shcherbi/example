package core.multithreading.p1startthread.demo2;

class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TestRunnableBasics {
    public static void main(String[] args) {
        Runner myThread = new Runner();
        new Thread(myThread).start();

        Runner myThread1 = new Runner();
        new Thread(myThread1).start();

        Runner myThread2 = new Runner();
        new Thread(myThread2).start();
    }
}
