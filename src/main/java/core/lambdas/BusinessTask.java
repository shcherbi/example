package core.lambdas;

public interface BusinessTask {
    default void updateStateInDBByDefault() {
        System.out.println("I am not abstract method in interface");
    }

    void updateStateInDB();
}
