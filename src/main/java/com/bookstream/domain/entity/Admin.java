package com.bookstream.domain.entity;

import com.bookstream.domain.Base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: bookstream
 * @description 管理员表[admins_table]:账号(account)、密码(password)、类型（type）
 * @author: JayChen
 * @create: 2020-02-02 18:03
 **/
@Entity
@Table(name = "admins_table")
public class Admin extends Base {
    @Id
    private String account;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private int type;

    private Admin(){
        super();
    }

    public Admin(String account, String password, int type) {
        this.account = account;
        this.password = password;
        this.type = type;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                '}';
    }
}
