package org.example;
import org.example.beans.Book;
import org.example.beans.Author;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {
    @Bean
    public Author author() {
        return new Author("Nhsmai");
    }

    @Bean
    public Book book() {
        return new Book( author() ); // Inject bean Author vào Book
    }
}
/*@Component - @Autowired*/
/*
@Component
public class Author {
    private String name = "Nhsmai";
    public String getName() { return name; }
}

@Component
public class Book {
    private String title = "Spring in Action";
    public String getTitle() { return title; }
}

@Component
public class Category {
    private final Book book;
    private final Author author;

    @Autowired
    public Category(Book book, Author author) {
        this.book = book;
        this.author = author;
    }
}*/
