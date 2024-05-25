package com.kgc.singleton;

/**
 * Created by jiang on 9/5/23 3:45 PM
 */
public class Test {
    public static void main(String[] args) {
        for(int i = 0; i<10;i++){
            //单线程下这样是可以保证只有一个对象的
//            Single.getInstance();
            //多线程则会创建多个对象
            //解决办法 为方法添加synchronized关键字
            //但是这样循环多少次就会添加多少次锁会造成系统资源浪费 懒汉式加载线程安全
            new Thread(()->{
//                Single.getInstance();
                //双重检测
                DoubleCheck.getInstance();
            }).start();

        }
    }
}
