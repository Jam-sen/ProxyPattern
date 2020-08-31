package com.ys;

import com.ys.handler.MyInvocationHandler;
import com.ys.service.GongNeng;
import com.ys.service.PrintInterface;

import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
        GongNeng gongNeng = new GongNeng ();
        MyInvocationHandler handler = new MyInvocationHandler (gongNeng);
        PrintInterface printInterface = (PrintInterface) Proxy.newProxyInstance (gongNeng.getClass ().getClassLoader (),gongNeng.getClass ().getInterfaces (),handler);
        printInterface.print ("123123");
    }
}
