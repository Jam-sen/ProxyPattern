package com.ys.proxy;

import com.ys.factory.KingSton;
import com.ys.service.SellInterface;

public class Taobao implements SellInterface {
    private KingSton kingSton = new KingSton ();
    public float sell(int a) {
        float price = kingSton.sell (a);
        float priceAll = price+10*a;
        float priceOne = price/a+10;
        System.out.println ("购买"+a+"个成功,单价"+priceOne+"元，共计"+priceAll+"元");
        return priceAll;
    }
}
