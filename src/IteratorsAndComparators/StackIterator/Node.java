package IteratorsAndComparators.StackIterator;

public class Node<Integer>{
    public int element;
    public Node<Integer> previousElement;

    public Node(int element){
        this.element = element;
        this.previousElement = null;
    }
}
