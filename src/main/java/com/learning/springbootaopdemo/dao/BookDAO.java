package com.learning.springbootaopdemo.dao;

import com.learning.springbootaopdemo.aspect.DisableMethod;
import com.learning.springbootaopdemo.aspect.TrackTime;
import com.learning.springbootaopdemo.domain.Book;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookDAO {
    
    @TrackTime
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        books.add(new Book(1, "Auto Biography", new BigDecimal(100.00)));

        return books;
    }

    @DisableMethod(isEnabled = true)
    public List<Book> getOldBooks() {
        List<Book> books = new ArrayList<>();

        books.add(new Book(2, "Auto Biography - old version", new BigDecimal(90.00)));

        return books;
    }
}
