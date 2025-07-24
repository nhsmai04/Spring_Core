package model;

public class Author{
    private String name;

    public Author(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("Author name is: " + name);
    }
}