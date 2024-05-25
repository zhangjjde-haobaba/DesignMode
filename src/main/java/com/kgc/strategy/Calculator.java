package com.kgc.strategy;

/**
 * Created by jiang on 9/3/23 10:23 PM
 */
public class Calculator {

    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int doOperation(int num1, int num2){
        return this.operation.doOperation(num1,num2);
    }
}
