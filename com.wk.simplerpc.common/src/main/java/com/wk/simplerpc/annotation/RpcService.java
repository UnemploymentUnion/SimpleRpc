package com.wk.simplerpc.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * PackageName com.wk.simplerpc.annotation
 * Created by wangkang on 2017/11/8.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component//表明可以被spring扫描
public @interface RpcService {
    Class<?> value();
}
