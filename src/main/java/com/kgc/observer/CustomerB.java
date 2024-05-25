package com.kgc.observer;

/**
 * Created by jiang on 9/4/23 10:41 AM
 */
public class CustomerB extends Customer{
    @Override
    public void update() {
        System.out.println("客户B的报纸已送达");
    }
}
