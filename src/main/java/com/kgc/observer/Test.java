package com.kgc.observer;

/**
 * Created by jiang on 9/4/23 10:48 AM
 */
public class Test {
    public static void main(String[] args) {
        NewspaperOffice newspaperOffice = new NewspaperOffice();
        Customer customerA = new CustomerA();
        Customer customerB = new CustomerB();
        //一对多关系 一是报社 多是用户
        newspaperOffice.addCustomer(customerA);
        newspaperOffice.addCustomer(customerB);
        newspaperOffice.newspaper();
    }
}
