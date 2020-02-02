package com.bookstream.domain.entity;
import com.bookstream.domain.Base;
import com.bookstream.domain.bean.Book_Id;

import javax.persistence.*;

/**
 * @program: bookstream
 * @description 书籍表[books_table]:书籍名称(book_title)、书籍作者(author)、书籍版本(version)、
 *              书籍详情信息(detail)、货主(host)、书籍数量(num)、单价(single_price)
 * @author: JayChen
 * @create: 2020-02-02 14:27
 **/
@Entity
@Table(name = "books_table")
@IdClass(Book_Id.class) //联合主键类别
public class Book extends Base {
    @Id
    private String book_title;
    @Id
    private String author;
    @Id
    private int version;

    @Column(nullable = false)
    private String detail;

    //当书的归属为平台时候，值为“11111111111”，若为私人则为该用户的电话号码,此属性为外键，参照User的主键
    @Column(nullable = false)
    private String host;

    @Column(nullable = false)
    private int num;

    @Column(nullable = false)
    private double single_price;

    private Book(){
        super();
    }

    public Book(String book_title, String author, int version, String detail, String host, int num, double single_price) {
        this.book_title = book_title;
        this.author = author;
        this.version = version;
        this.detail = detail;
        this.host = host;
        this.num = num;
        this.single_price = single_price;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSingle_price() {
        return single_price;
    }

    public void setSingle_price(double single_price) {
        this.single_price = single_price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_title='" + book_title + '\'' +
                ", author='" + author + '\'' +
                ", version=" + version +
                ", detail='" + detail + '\'' +
                ", host='" + host + '\'' +
                ", num=" + num +
                ", single_price=" + single_price +
                '}';
    }
}
