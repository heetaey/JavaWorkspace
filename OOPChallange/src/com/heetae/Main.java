package com.heetae;

public class Main {

    public static void main(String[] args) {
//
//        HamburgerN burger = new HamburgerN("Custom", "Wheat", "Beef", 4.00);
//        burger.setHasLettuce(true);
//        burger.setHasPickle(true);
//        burger.setHasTomato(true);
//
//        burger.finalBurger();

        HealthyBurger hb = new HealthyBurger("Bacon", 5.68);
        hb.addHealthAddition1("Lentis", 3.41);
        hb.addHealthAddition2("Eggs", 2.50);
        System.out.println("Total healthy burger price is " + hb.finalItem());

        DeluxeBurger db = new DeluxeBurger();
        db.finalBurger();

    }
}
