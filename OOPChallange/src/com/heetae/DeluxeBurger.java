package com.heetae;

/**
 * Created by hsMacbook on 2017. 6. 30..
 */
public class DeluxeBurger extends HamburgerN{
    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage & Bacon", 12.35);
        super.addHamburgerAddtion1("Chips", 2.00);
        super.addHamburgerAddtion2("Drinks", 1.50);
    }

    @Override
    public void addHamburgerAddtion1(String name, double price) {
        System.out.println("Cannot add addtional item on Deluexe burger");
    }

    @Override
    public void addHamburgerAddtion2(String name, double price) {
        System.out.println("Cannot add addtional item on Deluexe burger");
    }
}
