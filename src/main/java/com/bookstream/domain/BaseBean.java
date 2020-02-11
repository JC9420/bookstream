package com.bookstream.domain;

import java.io.Serializable;

/**
 * @program: bookstream
 * @description bean类的序列化类
 * @author: JayChen
 * @create: 2020-02-02 14:32
 **/
public class BaseBean implements Serializable {
    /**
     * 序列化就是将一个对象的状态（各个属性量）保存起来，然后在适当的时候再获得
     * 序列化之后，对象得以保存，可以用于网络传输
     */
    protected static final long serialVersionUID = 1L;
    protected int ecode; //0表示成功得到数据并返回
    protected String emsg; //可以描述一些异常信息

}
