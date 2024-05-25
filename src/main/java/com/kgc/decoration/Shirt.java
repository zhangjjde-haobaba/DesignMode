package com.kgc.decoration;

/**
 * Created by jiang on 9/4/23 10:03 AM
 */
public class Shirt extends ClothesDecorator{

    public Shirt(Person person) {
        super(person);
    }

    @Override
    public Double cost() {
        return this.person.cost() + 1000;
    }

    @Override
    public void show() {
        this.person.show();
        System.out.println("买了一件衬衫，累计消费"+this.cost());
    }
}
