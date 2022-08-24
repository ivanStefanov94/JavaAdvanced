package Generics.CustomList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> elements;

    public CustomList(){
        this.elements = new ArrayList<>();
    }
    public List<T> getElements(){
        return this.elements;
    }

    public void add(T element){
        this.elements.add(element);
    }
    public T remove(int index){
         return this.elements.remove(index);
    }
    public boolean contains(T element){
        return this.elements.contains(element);
    }
    public void swap(int index1, int index2){
        T firstIndex = this.elements.get(index1);
        T secondIndex = this.elements.get(index2);

        this.elements.set(index1, secondIndex);
        this.elements.set(index2, firstIndex);
    }
    public int countGreaterThan(T element){
        return (int) this.elements.stream().filter(e -> e.compareTo(element) > 0).count();
    }
    public T getMax(){
        return elements.stream().max((e1, e2) -> e1.compareTo(e2)).get();
    }
    public T getMin(){
        return elements.stream().max((e1, e2) -> e2.compareTo(e1)).get();
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (T element : elements) {
            builder.append(element).append(System.lineSeparator());
        }
        return builder.toString();
    }
}
