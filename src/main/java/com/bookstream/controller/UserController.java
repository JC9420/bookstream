package com.bookstream.controller;
import com.bookstream.domain.bean.UserBean;
import com.bookstream.domain.entity.User;
import com.bookstream.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @program: bookstream
 * @description
 * @author: JayChen
 * @create: 2020-02-01 23:05
 **/
@RestController
@RequestMapping("/users")
public class UserController {

    //自动注入仓库类，获取仓库实现
    @Autowired
    private UserRepository userRepository;

    /**
     * 获取所有的数据
     * @return
     */
    private List<User> getUserlist() {
        List<User> users = new ArrayList<>();
        for (User user : userRepository.findAll()) {
            users.add(user);
        }
        return users;
    }

    /**
     * 接口测试
     * @param phone_number
     * @return
     */
    @GetMapping("/test")
    public UserBean getUserInfo(@RequestParam String phone_number) {
        try {
            Optional<User> user =userRepository.findById(phone_number);
            if(user==null) return new UserBean(0,"查无此人！",null);
            else return new UserBean(0,"数据正常",user);
        }catch (Exception e){
            return new UserBean(-1,"数据异常",null);
        }

    }
}
