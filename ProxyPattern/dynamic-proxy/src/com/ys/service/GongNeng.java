package com.ys.service;

public class GongNeng implements PrintInterface{
    @Override
    public String print(String s) {
        System.out.println ("其他人写好的功能方法-->"+s);
        return s;
    }
}
