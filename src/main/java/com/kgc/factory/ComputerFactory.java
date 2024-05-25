package com.kgc.factory;

/**
 * Created by jiang on 9/5/23 4:59 PM
 */
public class ComputerFactory {

    public Computer createComputer(String name){

        Computer computer = null;
        if(name.equals("a")) computer = new ComputerA();
        if(name.equals("b")) computer = new ComputerB();
        return computer;
    }
}
