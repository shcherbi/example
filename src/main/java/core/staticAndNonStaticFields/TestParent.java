package core.staticAndNonStaticFields;

public class TestParent {
    protected static int staticVar = 0;

    static {
        staticVar = 1;
        System.out.println("Parent class static block: staticVar - " + staticVar);
    }

    protected int nonStaticVar = 0;

    {
        nonStaticVar = 1;
        System.out.println("Parent class non-static block: nonStaticVar - " + nonStaticVar);
    }

    public TestParent() {
        staticVar = 2;
        System.out.println("Parent class constructor: staticVar - " + staticVar);
        nonStaticVar = 2;
        System.out.println("Parent class constructor: nonStaticVar - " + nonStaticVar);
    }

    public static int getStaticVar() {
        return staticVar;
    }

    public int getNonStaticVar() {
        return nonStaticVar;
    }
}
