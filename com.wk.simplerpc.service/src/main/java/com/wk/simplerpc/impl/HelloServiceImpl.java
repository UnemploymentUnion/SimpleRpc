package com.wk.simplerpc.impl;

import com.wk.simplerpc.annotation.RpcService;
import com.wk.simplerpc.entity.User;
import com.wk.simplerpc.service.IHelloService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * PackageName com.wk.simplerpc.impl
 * Created by wangkang on 2017/11/9.
 */
@RpcService(IHelloService.class)
public class HelloServiceImpl implements IHelloService {
    public User updateUser(User user) {
        user.setName(user.getName() + "-update");
        return user;
    }

    public User getUser(String name) {
        User user = new User(name, new Date(), true);
        return user;
    }

    public String hello(String name) {
        String result = "hello" + name;
        System.out.println(result);
        return result;
    }

    public List<User> getUsers(int size) {
        List<User> list = new ArrayList<User>();
        User user = null;
        String name = "foo";
        Date birthday = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(birthday);
        for(int i = 0; i < size; i++){
            cal.add(Calendar.DAY_OF_MONTH, 1);
            user = new User(name, cal.getTime(), i%2==0 ? true : false);
            list.add(user);
        }
        return list;
    }
}
