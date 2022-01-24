package com.learning.springbootaopdemo.controller;

import com.learning.springbootaopdemo.domain.Book;
import com.learning.springbootaopdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    
    @Autowired
    BookService bookService;
    
    @GetMapping("/all")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/old/all")
    public List<Book> getOldBooks() {
        return bookService.getOldBooks();
    }
    
}
