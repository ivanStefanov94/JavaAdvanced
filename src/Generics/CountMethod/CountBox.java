package Generics.CountMethod;

import java.util.ArrayList;
import java.util.List;

public class CountBox<T extends Comparable<T>> {
    private List<T> elements;


    public CountBox(){
        this.elements = new ArrayList<>();

    }
    public void add(T element){
        this.elements.add(element);
    }
    public int countGreaterThan(T element){
        return (int) elements.stream().filter(e -> e.compareTo(element) > 0).count();
    }


}
