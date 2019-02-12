package core.java8.innernestedclass;

public class TestEntity implements ITestAction {
    protected String field;
    private String fieldPriv;

    //implemented from interface
    public String action() {
        return "action";
    }

    public String simple(){
        return "simple";
    }

    public String getFieldExist() {
        return field;
    }

    public void setFieldExist(String field) {
        this.field = field;
    }

    static class Gest extends TestEntity {
        @Override
        public String simple() {
            setFieldExist("gest" + field);
            return field;
        }
    }

    class Kest extends TestEntity {
        String local = "JustKest";
        @Override
        public String simple(){
            setFieldExist("kest");
            return fieldPriv + field;
        }

        @Override
        public String action() {
            String localVariable = "10";
            //class cannot apply access
            //class cannot be static into method
            class WTF{
                private String innerVariable = "40";
                public String getWTFSum(){
                    return innerVariable + field + fieldPriv + local;//localVariable - cannot use
                }
            }
            return new WTF().innerVariable;
        }

        //static method or variable cannot be declare into inner class
        //public static void lol(){}
        //static long i = 0;
    }
}
