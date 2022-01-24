package com.learning.springbootaopdemo.service;

import com.learning.springbootaopdemo.dao.BookDAO;
import com.learning.springbootaopdemo.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    
    @Autowired
    private BookDAO bookDAO;
    
    public List<Book> getBooks() {
        return bookDAO.getBooks();
    }

    public List<Book> getOldBooks() {
        return bookDAO.getOldBooks();
    }
 }
