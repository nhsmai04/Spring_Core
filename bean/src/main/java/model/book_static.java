package model;

public class book_static {
    private static book_static book = new book_static();

    private book_static(){}

    public static book_static createInstance(){
        return book;
    }
}
