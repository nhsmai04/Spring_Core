package model;

public class Student {
    private String name;
    private String language;

    public Student(){}

    public Student(String name){
        this.name = name;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public void show() {
        System.out.println("Student Name: " + name);
    }

    public void setName(String name){
        this.name = name;
    }

    public void speak(){
        System.out.println(name+ " nói: " +language);
    }
}
