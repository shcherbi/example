package core.multithreading.p3multiplylocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
    private Random random = new Random();

    private Object object1 = new Object();
    private Object object2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void stageOne() {
        synchronized (object1) { //used instead of synchronized method
            // cause in this case thread stuck only one method nor all sync methods
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void stageTwo() {
        synchronized (object2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void process() {
        for (int i = 0; i < 1000; i++) {
            stageOne();
            stageTwo();
        }
    }

    public void main() {
        System.out.println("Starting......");
        long start = System.currentTimeMillis();

        Thread t1 = new Thread(this::process);
        Thread t2 = new Thread(this::process);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();

        System.out.println("Time take: " + (end - start));
        System.out.println(list1.size());
        System.out.println(list2.size());
    }
}
