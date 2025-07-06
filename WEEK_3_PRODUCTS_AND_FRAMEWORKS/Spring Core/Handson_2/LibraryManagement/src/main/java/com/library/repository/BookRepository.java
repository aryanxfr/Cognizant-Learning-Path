package com.library.repository;

public class BookRepository {
    public void save(String title,String author){
        System.out.println("BookRepository: Saved Book- " + title + "by " + author);
    }
}
