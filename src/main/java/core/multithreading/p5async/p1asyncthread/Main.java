package core.multithreading.p5async.p1asyncthread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // if we are not accessing any synchronized part of code than pretty simple example of async task
        Thread newAsyncTaskThread = new Thread(() -> {
            System.out.println("\nHello");
        });
        newAsyncTaskThread.start();
        newAsyncTaskThread.join();

    }
}
