package IteratorsAndComparators.Book;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Game of thrones", 2005);
        Book book1 = new Book("Game of thrones", 2005, "George RR");
        Book book2 = new Book("Game of thrones", 2005, "Peter RR", "Tom", "Rowan");


        System.out.println(book.getAuthors());
        System.out.println(book1.getAuthors());
        System.out.println(book2.getAuthors());
    }
}
