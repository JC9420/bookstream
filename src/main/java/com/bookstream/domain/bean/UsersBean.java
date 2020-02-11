package com.bookstream.domain.bean;

import com.bookstream.domain.BaseBean;
import com.bookstream.domain.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: bookstream
 * @description
 * @author: JayChen
 * @create: 2020-02-05 12:34
 **/
public class UsersBean extends BaseBean {
    private List<User> data;

    public UsersBean(int ecode,String emsg,List<User> data) {
        this.ecode=ecode;
        this.emsg = emsg;
        this.data = new ArrayList<>(data);
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = new ArrayList<>(data);
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

    @Override
    public String toString() {
        return "UsersBean{" +
                "data=" + data.toString() +
                ", ecode=" + ecode +
                ", emsg='" + emsg + '\'' +
                '}';
    }
}
