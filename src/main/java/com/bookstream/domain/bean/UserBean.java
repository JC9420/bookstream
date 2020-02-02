package com.bookstream.domain.bean;

import com.bookstream.domain.BaseBean;
import com.bookstream.domain.entity.User;
import java.util.Optional;

/**
 * @program: start
 * @description 数据返回样例
 * @author: JayChen
 * @create: 2020-02-01 15:40
 **/

public class UserBean extends BaseBean {

    private Optional<User> user;

    public UserBean(int ecode, String emsg, Optional<User> user) {
        this.ecode = ecode;
        this.emsg = emsg;
        this.user = user;
    }

    public int getEcode() {
        return ecode;
    }

    public void setEcode(int ecode) {
        this.ecode = ecode;
    }

    public String getEmsg() {
        return emsg;
    }

    public void setEmsg(String emsg) {
        this.emsg = emsg;
    }

    public Optional<User> getUser() {
        return user;
    }

    public void setUser(Optional<User> user) {
        this.user = user;
    }
}
