package com.heetae;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Shinhan Bank");

        bank.addBranch("Seoul");
        bank.addCustomer("Seoul", "Heetae", 50.40);
        bank.addCustomer("Seoul", "Jay", 220.12);
        bank.addCustomer("Seoul", "Park", 22.40);

        bank.addCustomerTransaction("Seoul", "Heetae", 250.00);
        bank.addCustomerTransaction("Seoul", "Heetae", 12.42);
        bank.addCustomerTransaction("Seoul", "Jay", 12.20);


        bank.listCustomers("Seoul", true);


    }

}
