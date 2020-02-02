package com.bookstream.repository;

import com.bookstream.domain.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @program: bookstream
 * @description User仓库类
 * @author: JayChen
 * @create: 2020-02-01 23:04
 **/
public interface UserRepository extends CrudRepository<User,String> {

}
