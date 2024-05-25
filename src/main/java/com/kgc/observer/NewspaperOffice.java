package com.kgc.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiang on 9/4/23 10:42 AM
 */
public class NewspaperOffice {
    //被观察者
    //报社
    //需要保存所有观察者的地址
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer){
        customers.add(customer);

    }
    //当被观察者改变时要通知所有观察者
    public void notifyAllObservers(){
        for(Customer customer:customers){
            customer.update();
        }
    }

    public void newspaper(){
        this.notifyAllObservers();
    }

}
