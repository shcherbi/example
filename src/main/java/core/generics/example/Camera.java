package core.generics.example;

public class Camera extends Product<Camera>{
    private double pixel;

    public double getPixel() {
        return pixel;
    }

    public void setPixel(double pixel) {
        this.pixel = pixel;
    }

    @Override
    protected int deepCompare(Camera p) {
        if (p instanceof Camera){

        }
        return 0;
    }
}
