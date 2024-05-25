package com.kgc.singleton;

/**
 * Created by jiang on 9/5/23 4:21 PM
 */
public class DoubleCheck {
    private volatile static DoubleCheck instance;

    private DoubleCheck(){
        System.out.println("创建了Single对象");
    }

    public static DoubleCheck getInstance(){
        if(instance == null){
            synchronized (DoubleCheck.class){
                if(instance == null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
    /**
     * instance 被声明为 volatile。这确保：
     *
     * 当 instance 被初始化后，多个线程能立即看到这一改变。
     * instance = new DoubleCheck(); 这一操作是原子的，因为没有其他线程能看到 instance 在完全被初始化之前就不是 null
     */
}

