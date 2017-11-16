package com.wk.simplerpc;

import com.wk.simplerpc.client.RpcProxy;
import com.wk.simplerpc.service.IHelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * PackageName com.wk.simplerpc
 * Created by wangkang on 2017/11/14.
 */
public class Main {

    public static void main(String[] arg){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //RpcProxy proxy = new Main().rpcProxy;
        RpcProxy proxy = (RpcProxy)ctx.getBean("rpcProxy");
        if(proxy == null){
            System.out.println("proxy is null");
            System.exit(-1);
        }
        IHelloService service = proxy.create(IHelloService.class);
        String result = service.hello("wangkang");
        System.out.println("result: " + result);
        System.exit(0);
    }
}
