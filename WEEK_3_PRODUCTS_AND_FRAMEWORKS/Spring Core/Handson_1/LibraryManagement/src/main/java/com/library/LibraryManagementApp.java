package com.library;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        BookRepository bookRepository=(BookRepository) applicationContext.getBean("bookRepository");
        BookService bookService=(BookService) applicationContext.getBean("bookService");

        bookService.addBook();
        bookRepository.saveBook();
    }
}
