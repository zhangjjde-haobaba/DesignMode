package com.kgc.decoration;

/**
 * Created by jiang on 9/4/23 9:57 AM
 */
public abstract class ClothesDecorator implements Person {

    protected Person person;

    public ClothesDecorator(Person person) {
        this.person = person;
    }
}
