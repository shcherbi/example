package core.multithreading.p5async.p2futuretask;

import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(1);
        long startTime = System.currentTimeMillis();
        Future<String> futureTas1 = threadPool.submit(() -> {
            Thread.sleep(1000);
            return "Result of Future Task 1 execution";
        });


        while (!futureTas1.isDone()) {
        }
        long endTime = System.currentTimeMillis();

        System.out.println("\n");
        System.out.println("Time of execution " + Duration.ofMillis(endTime - startTime).toSeconds());
        System.out.println(futureTas1.get());

        threadPool.shutdown();
    }
}
