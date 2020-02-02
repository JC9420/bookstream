package com.bookstream.domain.entity;


import com.bookstream.domain.Base;

import javax.persistence.*;

/**
 * @program: bookstream
 * @description 捐赠表[donates_table]:自增id(id)、书籍名称(book_title)、书籍作者(author)、书籍版本(version)、
 *              捐赠量(num)、捐赠者(who_donate)、时间戳(time_stamp)
 * @author: JayChen
 * @create: 2020-02-02 17:51
 **/
@Entity
@Table(name = "contributors_table")
public class Contributor extends Base {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String book_title;

    @Column(nullable = true)
    private String author;

    @Column(nullable = true)
    private int version;

    @Column(nullable = false)
    private int num;

    @Column(nullable = false)
    private String who_donate;

    @Column(nullable = false)
    private String time_stamp;

    private Contributor(){
        super();
    }

    public Contributor(Long id, String book_title, String author, int version, int num, String who_donate, String time_stamp) {
        this.id = id;
        this.book_title = book_title;
        this.author = author;
        this.version = version;
        this.num = num;
        this.who_donate = who_donate;
        this.time_stamp = time_stamp;
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

    public String getWho_donate() {
        return who_donate;
    }

    public void setWho_donate(String who_donate) {
        this.who_donate = who_donate;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    @Override
    public String toString() {
        return "Contributor{" +
                "id=" + id +
                ", book_title='" + book_title + '\'' +
                ", author='" + author + '\'' +
                ", version=" + version +
                ", num=" + num +
                ", who_donate='" + who_donate + '\'' +
                ", time_stamp='" + time_stamp + '\'' +
                '}';
    }
}
