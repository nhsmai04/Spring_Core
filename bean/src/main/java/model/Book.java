package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Autowired
    private Author_Auto author;

    public void show(){
        author.show();
    }
}
