package core.generics.example;

public class Main {
    public static void main(String[] args) {
        Container<Product> c1 = new Container<>();
        c1.setItem(new Phone());
        c1.setItem(new Camera());
        Product p = c1.getItem();

        Container<Camera> c2 = new Container<>();
        Camera c = c2.getItem();
    }
}
