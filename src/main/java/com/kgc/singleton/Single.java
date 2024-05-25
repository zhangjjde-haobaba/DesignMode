package com.kgc.singleton;

/**
 * Created by jiang on 9/5/23 3:34 PM
 */
public class Single {

    //希望对象只有一个 懒汉式
//    private static Single instance;

    //饿汉式 直接初始化
    private static Single instance = new Single();

    //单例模式 构造器私有化
    private Single(){
        System.out.println("创建了Single对象");
    }

    public static Single getInstance(){
        //懒汉式才需要判断 饿汉式直接返回
//        if(instance == null) instance = new Single();
        return instance;
    }
}
