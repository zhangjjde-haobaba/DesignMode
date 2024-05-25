package com.kgc.observer;

/**
 * Created by jiang on 9/4/23 10:39 AM
 */
public class CustomerA extends Customer{
    @Override
    public void update() {
        System.out.println("客户A的报纸已经送达");
    }
}
