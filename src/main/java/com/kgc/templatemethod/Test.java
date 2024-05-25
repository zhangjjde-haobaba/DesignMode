package com.kgc.templatemethod;

/**
 * Created by jiang on 9/6/23 11:10 AM
 */
public class Test {
    public static void main(String[] args) {
        Cook cook  = new CookTomatos();
        cook.cook();
        System.out.println("********************");
        cook = new CookPotato();
        cook.cook();
    }
}
