package org.example.beans;


public class Book {
    private String name;
    private double price;
    private Author author;
    public Book(String name, double price, Author author)
    {
        this.name = name;
        this.price = price;
        this.author = author;
    }
    public Book() {}
    public Book(Author author)
    {
        this.author = author;
    }
    public Author getAuthor() {return author;}
    public void setAuthor(Author author) {this.author = author;}
}
