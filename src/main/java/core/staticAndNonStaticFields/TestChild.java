package core.staticAndNonStaticFields;

public class TestChild extends TestParent {
    static {
        staticVar = 3;
        System.out.println("Child class static block: staticVar - " + staticVar);
    }

    {
        nonStaticVar = 3;
        System.out.println("Child class non-static block: nonStaticVar - " + nonStaticVar);
    }

    public TestChild() {
        staticVar = 4;
        System.out.println("Child class constructor: staticVar - " + staticVar);
        nonStaticVar = 4;
        System.out.println("Child class constructor: nonStaticVar - " + nonStaticVar);
    }
}
