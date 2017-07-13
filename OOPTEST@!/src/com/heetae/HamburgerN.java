package com.heetae;

/**
 * Created by hsMacbook on 2017. 6. 29..
 */
public class HamburgerN {
    private String name;
    private String roll;
    private String meat;
    private double price;

    private boolean hasLettuce;
    private boolean hasTomato;
    private boolean hasPickle;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    public HamburgerN(String name, String roll, String meat, double price) {
        this.name = name;
        this.roll = roll;
        this.meat = meat;
        this.price = price;
    }

    public void setHasLettuce(boolean hasLettuce) {
        this.hasLettuce = hasLettuce;
        if (this.hasLettuce) {
            System.out.println("Lettuce is added.");
            this.price += 0.30;
        }
    }

    public void setHasTomato(boolean hasTomato) {
        this.hasTomato = hasTomato;
        if (this.hasTomato) {
            this.price += 0.20;
            System.out.println("Tomato is added.");
        }
    }

    public void setHasPickle(boolean hasPickle) {
        this.hasPickle = hasPickle;
        if (this.hasPickle) {
            this.price += 0.15;
            System.out.println("Pickle is added.");
        }
    }

    public void addHamburgerAddtion1 (String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddtion2 (String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public double finalBurger() {
        System.out.println("Your " + name + " burger has a " + roll + " bread with "
                                + meat);
        System.out.println("The final price is " + this.price);
        return this.price;
    }
}
