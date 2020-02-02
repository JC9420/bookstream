package com.bookstream.domain.entity;

import com.bookstream.domain.Base;

import javax.persistence.*;

/**
 * @program: bookstream
 * @description交易表[transactions_table]:自增id(id)、书籍名称(book_title)、
 *                  书籍作者(author)、书籍版本(version)、交易数量(num)、货主(host)、受众(recipient)、
 *                  是否是租赁(is_rent)、时间戳(time_stamp)、交易金额(price)
 * @author: JayChen
 * @create: 2020-02-02 17:26
 **/
@Entity
@Table(name = "transactions_table")
public class Transaction extends Base {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String book_title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private int version;

    @Column(nullable = false)
    private int num;

    @Column(nullable = false)
    private String host;

    @Column(nullable = false)
    private String recipient;

    @Column(nullable = false)
    private int is_rent;

    @Column(nullable = false)
    private String time_stamp;

    @Column(nullable = false)
    private Double price;

    private Transaction(){
        super();
    }

    public Transaction(Long id, String book_title, String author, int version, int num, String host, String recipient, int is_rent, String time_stamp, Double price) {
        this.id = id;
        this.book_title = book_title;
        this.author = author;
        this.version = version;
        this.num = num;
        this.host = host;
        this.recipient = recipient;
        this.is_rent = is_rent;
        this.time_stamp = time_stamp;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public int getIs_rent() {
        return is_rent;
    }

    public void setIs_rent(int is_rent) {
        this.is_rent = is_rent;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", book_title='" + book_title + '\'' +
                ", author='" + author + '\'' +
                ", version=" + version +
                ", num=" + num +
                ", host='" + host + '\'' +
                ", recipient='" + recipient + '\'' +
                ", is_rent=" + is_rent +
                ", time_stamp='" + time_stamp + '\'' +
                ", price=" + price +
                '}';
    }
}
