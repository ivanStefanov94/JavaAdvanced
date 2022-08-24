package Generics.GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> elements;

    public Box(){
        this.elements = new ArrayList<>();
    }

    public void add(T input){
        this.elements.add(input);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        for (T element : elements) {
            builder.append(String.format("%s: %s", element.getClass().getName(), element)).append(System.lineSeparator());
        }
        return  builder.toString();
    }
}
