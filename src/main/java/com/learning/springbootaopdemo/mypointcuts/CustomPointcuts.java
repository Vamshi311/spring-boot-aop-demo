package com.learning.springbootaopdemo.mypointcuts;

import org.aspectj.lang.annotation.Pointcut;

public class CustomPointcuts {

    @Pointcut(value = "execution(* com.learning.springbootaopdemo.dao.BookDAO.getBooks())")
    public void getBooks() {
    }

    @Pointcut("execution(* com.learning.springbootaopdemo.service.BookService.getOldBooks())")
    public void serviceMethods() {
    }
}
