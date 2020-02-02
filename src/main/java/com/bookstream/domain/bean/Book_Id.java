package com.bookstream.domain.bean;


import com.bookstream.domain.Base;

/**
 * @program: bookstream
 * @description book表的联合外键类
 * @author: JayChen
 * @create: 2020-02-02 14:50
 **/
public class Book_Id extends Base {
    private String book_title;
    private String author;
    private int version;

    public Book_Id(String book_title, String author, int version) {
        this.book_title = book_title;
        this.author = author;
        this.version = version;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
