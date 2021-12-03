package core.multithreading.p5async.p3completablefuture;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();
        /**
         * We don't need to use the ExecutorService explicitly.
         * The CompletableFuture internally uses ForkJoinPool to handle the task asynchronously.
         */
        CompletableFuture<String> futureTas1 = CompletableFuture
                .supplyAsync(() -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return "Result of Future Task 1 execution";
                })
                .thenApply(s -> "[Then Apply]" + s);

        /**
         * About thenApply and thenApplyAsync
         *
         * The methods without the Async postfix run the next execution stage using a calling thread.
         * In contrast, the Async method WITHOUT the Executor argument runs a step using a new fork join pool executor.
         * Finally, the Async method with an Executor argument runs a step using the passed Executor.
         */

        while (!futureTas1.isDone()) {
        }
        long endTime = System.currentTimeMillis();

        System.out.println("\n");
        System.out.println("Time of execution " + Duration.ofMillis(endTime - startTime).toSeconds());
        System.out.println(futureTas1.get());
    }
}
