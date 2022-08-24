package IteratorsAndComparators.StackIterator;

import java.util.Iterator;

public class StackIterator<Integer> implements Iterable<Integer> {

    private Node<Integer> topElement;

    public StackIterator() {
        this.topElement = null;
    }

    public void push(int newElement){
        Node<Integer> newNode = new Node<>(newElement);
        newNode.previousElement = this.topElement;
        this.topElement = newNode;
    }

    public int pop() throws Exception {
        if(this.topElement == null){
            throw new Exception("Stack is empty! No elements to remove!");
        }else{
            Node<Integer> currentTopElement = this.topElement;
            this.topElement = this.topElement.previousElement;
            return currentTopElement.element;
        }
    }



    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private Node<Integer> currentElement = topElement;


            @Override
            public boolean hasNext() {
                return currentElement != null;
            }

            @Override
            public Integer next() {
                int currentValue = currentElement.element;
                this.currentElement = this.currentElement.previousElement;
                return (Integer) java.lang.Integer.valueOf(currentValue);
            }
        };
    }
}
