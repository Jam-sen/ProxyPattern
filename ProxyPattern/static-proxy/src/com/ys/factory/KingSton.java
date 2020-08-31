package com.ys.factory;

import com.ys.service.SellInterface;

public class KingSton implements SellInterface {
    @Override
    public float sell(int a) {
        return a*80f;
    }
}
