package com.kgc.strategy;

/**
 * Created by jiang on 9/3/23 10:27 PM
 */
public class OperationSub implements Operation{
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
