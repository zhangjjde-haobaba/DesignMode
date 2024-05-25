package com.kgc.decoration;

/**
 * Created by jiang on 9/4/23 10:08 AM
 */
public class Trousers extends ClothesDecorator {
    public Trousers(Person person) {
        super(person);
    }

    @Override
    public Double cost() {
        return this.person.cost() + 800;
    }

    @Override
    public void show() {
        this.person.show();
        System.out.println("买了一条裤子，累计消费"+this.cost());
    }
}
