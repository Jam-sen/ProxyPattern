package com.ys.handler;

import com.ys.service.GongNeng;
import com.ys.service.PrintInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private GongNeng gongNeng ;
    public MyInvocationHandler(GongNeng gongNeng) {
        this.gongNeng = gongNeng;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = method.invoke (gongNeng,args);
        if (res!=null){
            String str = String.valueOf (Integer.parseInt ((String)res)+1);
            System.out.println ("代理增强过的方法执行了-->"+str);
        }
        return res;
    }
}
