package model;

import org.springframework.stereotype.Component;

@Component
public class Author_Comp {
    private String name;

    public Author_Comp(){
        this.name = "Quynh";
    }

    public void show(){
        System.out.println("Author: " +name);
    }
}
