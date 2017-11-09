package com.wk.simplerpc.service;

import com.wk.simplerpc.entity.User;

import java.util.List;

/**
 * PackageName com.wk.simplerpc.service
 * Created by wangkang on 2017/11/9.
 */
public interface IHelloService {
    public String hello(String name);

    public User getUser(String name);

    public List<User> getUsers(int size);

    public User updateUser(User user);
}
