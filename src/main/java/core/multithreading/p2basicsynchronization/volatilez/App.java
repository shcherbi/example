package core.multithreading.p2basicsynchronization.volatilez;

import java.util.Scanner;

class Processor extends Thread {

    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }
}

public class App {
    public static void main(String[] args) {
        Processor p1 = new Processor();
        p1.start();

        System.out.println("Press return to stop");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        p1.shutdown();
    }
}
