package com.kgc.templatemethod;

/**
 * Created by jiang on 9/6/23 10:57 AM
 */
public abstract class Cook {

    public void open(){
        System.out.println("打开抽油烟机");
    }

    public void fire(){
        System.out.println("生火");
    }

    public abstract void doCook();

    public void outFire(){
        System.out.println("关火");
    }

    public void close(){
        System.out.println("关闭抽油烟机");
    }

    //使用final确定流程是固定的
    public final void cook(){
        this.open();
        this.fire();
        this.doCook();
        this.outFire();
        this.close();
    }
}
