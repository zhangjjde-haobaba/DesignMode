package com.kgc.proxy;

/**
 * Created by jiang on 9/6/23 10:47 AM
 */
public class HouseProxy implements House {

    private House house;

    public HouseProxy(House house) {
        this.house = house;
    }

    @Override
    public void findHouse() {
        System.out.println("日志：找了一个代理");
        //确保委托代码是纯粹的 aop是类似的思想
        this.house.findHouse();
    }
}
