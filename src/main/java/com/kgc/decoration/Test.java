package com.kgc.decoration;

/**
 * Created by jiang on 9/4/23 9:47 AM
 */
public class Test {

    public void show(){
        System.out.println("买衣服花了1000元");
        System.out.println("买裤子花了800元");
        System.out.println("买鞋子花了900元");
    }

    public static void main(String[] args) {
        Person xiaoming = new XiaoMing();
        xiaoming = new Shirt(xiaoming);
        xiaoming = new Trousers(xiaoming);
        xiaoming.show();
        System.out.println("小明的总消费:"+xiaoming.cost());
    }
}
