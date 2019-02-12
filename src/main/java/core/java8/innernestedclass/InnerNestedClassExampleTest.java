package core.java8.innernestedclass;

public class InnerNestedClassExampleTest {
    public static void main(String[] args) {
        TestEntity test = new TestEntity(){
            @Override
            public String simple() {
                return super.simple();
            }
        };
        System.out.println(ITestAction.x);
        System.out.println(test.simple());
        test = new TestEntity(){
            @Override
            public String simple() {
                return "anon/danon" + x;
            }
        };
        System.out.println(test.simple());

        test = new TestEntity(){
            public String yepItIsChild(){
                return "child of Test class";
            }

            @Override
            public String action() {
                return super.action() + " " + yepItIsChild();
            }
        };
        System.out.println(test.action());
        test = new TestEntity(){
            @Override
            public String action() {
                return "passion" + (x+12);
            }
        };
        System.out.println(test.action());

        ITestAction testAction = new TestEntity(){
            //private static String lol = "lol"; -cannot declare static
            private static final int kek = 5; // but we can use const
            @Override
            public String simple() {
                return super.simple() +" | "+ field;
            }

            @Override
            public String action() {
                return super.action() + kek;
            }
        };
        System.out.println(((TestEntity) testAction).simple());
        System.out.println(testAction.action());

        int lol = 1;
        testAction = new TestEntity(){
            private int vika;
            @Override
            public String action() {
                //lol -cannot be used, bacuse it's not final (might be effectively)
                return String.valueOf(vika);
            }
        };
        System.out.println(testAction.action());

        test = new TestEntity();
        System.out.println(test.simple());
    }
}
