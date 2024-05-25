package com.kgc.decoration;

/**
 * Created by jiang on 9/4/23 9:56 AM
 */
public class XiaoMing implements Person{
    @Override
    public Double cost() {
        return 0.0;
    }

    @Override
    public void show() {
        System.out.println("没穿衣服的小明");
    }
}
