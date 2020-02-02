package com.bookstream.repository;


import com.bookstream.domain.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

/**
 * @program: bookstream
 * @description Transaction仓库类
 * @author: JayChen
 * @create: 2020-02-02 18:07
 **/
public interface TransactionRepository extends CrudRepository<Transaction,Long> {
}
