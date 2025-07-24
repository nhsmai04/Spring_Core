package factory;

import service.book_service;
import service.book_service_impl;

public class bookServiceLocator {
    private book_service book = new book_service_impl();

    public book_service createBookService(){
        return book;
    }
}
