package core.lambdas;

public class Main {
    public static void main(String[] args) {
        Runnable runTask1 = () -> {
            new BusinessTaskUpdateCustomerAge().updateStateInDB();
            try {
                Thread.sleep(1000);
                System.out.println("!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        executeTask(runTask1);
        executeTask(runTask1);
    }

    private static void executeTask(Runnable logic) {
        new Thread(logic).start();
    }
}
