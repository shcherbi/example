package core.generics.example;

import java.io.Serializable;
import java.util.List;

public class Container<T extends Product> {
//public class Container<T extends Product & Comparable<T> & Serializable> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public <X> boolean find(List<? extends X> all, Product p){
        return true;
    }

    public void copy(List<? extends Product> src, List<? super Product> dest){}
}
