package core.staticAndNonStaticFields;

public class Main {
    public static void main(String[] args) {
        TestParent test = new TestChild();
        System.out.println("Current result for static - " + TestChild.staticVar);
        System.out.println("Current result for non-static - " + test.getNonStaticVar());
    }
}
