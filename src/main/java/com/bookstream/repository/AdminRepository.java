package com.bookstream.repository;

import com.bookstream.domain.entity.Admin;
import org.springframework.data.repository.CrudRepository;

/**
 * @program: bookstream
 * @description Admin仓库类
 * @author: JayChen
 * @create: 2020-02-02 18:13
 **/
public interface AdminRepository extends CrudRepository<Admin,String> {

}
