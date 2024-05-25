package com.kgc.factory;

/**
 * Created by jiang on 9/5/23 5:05 PM
 */
public class Test {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer a = factory.createComputer("a");
        Computer b = factory.createComputer("b");
    }
}
