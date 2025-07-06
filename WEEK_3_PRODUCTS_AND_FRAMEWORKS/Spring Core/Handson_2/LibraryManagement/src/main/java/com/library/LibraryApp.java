package com.library;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService=(BookService) context.getBean("bookService");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book name: ");
        String title= sc.nextLine();
        System.out.println("Enter author name: ");
        String author= sc.nextLine();
        bookService.addBook(title,author);
    }
}
