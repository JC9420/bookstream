package com.bookstream.repository;


import com.bookstream.domain.bean.Book_Id;
import com.bookstream.domain.entity.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @program: bookstream
 * @description Book仓库类
 * @author: JayChen
 * @create: 2020-02-02 18:11
 **/
public interface BookRepository extends CrudRepository<Book, Book_Id> {
}
