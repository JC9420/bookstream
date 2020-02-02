package com.bookstream.domain.entity;

import com.bookstream.domain.Base;

import javax.persistence.*;

/**
 * @program: bookstream
 * @description 用户表[users_table]:电话号码(phone_number)、密码(password)、名字(name)、性别(sex)、年龄(age)、账户类型(type)
 * @author: JayChen
 * @create: 2020-02-01 22:50
 **/

@Entity
@Table(name = "users_table")
public class User extends Base {
    @Id
    //@ManyToMany(targetEntity= Book.class,fetch=LAZY,mappedBy="phone_number")
    //@JsonIgnore
    private String phone_number;//主键-电话号码

    @Column(nullable = false) // 映射为字段，值不能为空
    private String password;//密码

    @Column(nullable = false) // 映射为字段，值不能为空
    private String name;//名字

    @Column(nullable = false) // 映射为字段，值不能为空
    private int sex;//性别 1-男 0-女

    @Column(nullable = false) // 映射为字段，值不能为空
    private int age;//年龄

    protected User(){//无参构造函数，设置为私有类型防止直接使用
        super();
    }

    public User(String phone_number, String password, String name, int sex, int age) {
        this.phone_number = phone_number;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "phone_number='" + phone_number + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
