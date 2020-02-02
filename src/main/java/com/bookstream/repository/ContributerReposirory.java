package com.bookstream.repository;


import com.bookstream.domain.entity.Contributor;
import org.springframework.data.repository.CrudRepository;

/**
 * @program: bookstream
 * @description Contributor仓库类
 * @author: JayChen
 * @create: 2020-02-02 18:09
 **/
public interface ContributerReposirory extends CrudRepository<Contributor,Long> {
}
