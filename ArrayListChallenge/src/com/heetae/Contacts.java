package com.heetae;

/**
 * Created by hsMacbook on 2017. 7. 12..
 */
public class Contacts {
    private String name;
    private String numbers;

    public Contacts(String name, String numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public static Contacts createContact(String name, String numbers) {
        return new Contacts(name, numbers);
    }

    public String getName() {
        return name;
    }

    public String getNumbers() {
        return numbers;
    }
}
