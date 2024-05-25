package com.kgc.proxy;

/**
 * Created by jiang on 9/6/23 10:49 AM
 */
public class Test {
    public static void main(String[] args) {
        House house = new Xiaoming();
        HouseProxy houseProxy = new HouseProxy(house);
        houseProxy.findHouse();
    }
}
