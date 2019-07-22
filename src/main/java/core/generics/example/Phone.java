package core.generics.example;

public class Phone extends Product<Phone>{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    protected int deepCompare(Phone p) {
        if(p instanceof Phone){

        }
        return 0;
    }
}
