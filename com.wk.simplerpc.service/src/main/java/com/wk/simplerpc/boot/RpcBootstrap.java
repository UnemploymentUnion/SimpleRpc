package com.wk.simplerpc.boot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * PackageName com.wk.simplerpc.boot
 * Created by wangkang on 2017/11/9.
 */
public class RpcBootstrap {
    public static void main(String[] arg){
        new ClassPathXmlApplicationContext("classpath:spring.xml");
    }
}
