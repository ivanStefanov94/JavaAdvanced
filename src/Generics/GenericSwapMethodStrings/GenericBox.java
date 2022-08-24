package Generics.GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;

public class GenericBox<T> {
    private List<T> elements;

    public GenericBox(){
        this.elements = new ArrayList<>();
    }
    public void add(T input){
        this.elements.add(input);
    }
    public void swap(int index1, int index2){
        T firstElement = this.elements.get(index1);
        T secondElement = this.elements.get(index2);
        this.elements.set(index2, firstElement);
        this.elements.set(index1, secondElement);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (T element : elements) {
            builder.append(String.format("%s: %s",element.getClass().getName(), element)).append(System.lineSeparator());
        }
        return builder.toString();
    }
}
