package IteratorsAndComparators.ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator {

    private List<String> data;
    private int index;

    public ListyIterator(List<String> data) {
        this.data = data;
        setIndex();
    }

    public boolean move(){
        if(this.index > -1 && this.data.size() -1 >= this.index){
            this.index++;
            return true;
        }
        return false;

    }

    public boolean hasNext(){
        return this.data.size() - 1 > this.index;
    }

    public void print() throws Exception {
        if(this.data.size() != 0){
            System.out.println(this.data.get(this.index));
        }else{
            throw new Exception("Invalid operation!");
        }
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex() {
        if(this.getData().size() != 0){
            this.index = 0;
        }else{
            this.index = -1;
        }
    }

    public void printAll(){
        for (String element : data) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
