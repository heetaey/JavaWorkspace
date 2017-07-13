package com.heetae;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone("206 605 2850");

    public static void main(String[] args) {

        printMenu();
        boolean quit = false;
        while (!quit) {
            System.out.println("Select your choice");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("System closing...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    modifyContacts();
                    break;
                case 4:
                    removeContacts();
                    break;
                case 5:
                    findContacts();
                    break;
            }
        }


    }

    public static void printMenu() {
        System.out.println("Select your options: \n"
                +   "0 -- Quit \n"
                +   "1 -- print the contact list \n"
                +   "2 -- add new contact \n"
                +   "3 -- update existing contacts \n"
                +   "4 -- remove contacts \n"
                +   "5 -- find contacts");
    }

    public static void printContacts() {
        System.out.println("Creating your contact list...");
        phone.printContacts();
    }

    public static void addContacts() {
        System.out.println("Please enter the name: ");
        String name = sc.nextLine();
        System.out.println("Please enter the number: ");
        String number = sc.nextLine();
        Contacts newContact = Contacts.createContact(name, number);
        phone.addNewContact(newContact);
    }

    public static void modifyContacts() {
        System.out.println("Enter the contact name to modify: ");
        String name = sc.nextLine();
        Contacts oldContact = phone.queryContact(name);
        if (oldContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = sc.nextLine();
        System.out.println("Enter new phone number: ");
        String newNumber = sc.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumber);
        if (phone.modifyContacts(oldContact, newContact)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Error updating contact.");
        }
    }

    public static void removeContacts() {
        System.out.println("Enter the contact name to modify: ");
        String name = sc.nextLine();
        Contacts oldContact = phone.queryContact(name);
        if (oldContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        if (phone.removeContacts(oldContact)) {
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Error deleting contact.");
        }

    }

    public static void findContacts() {
        System.out.println("Enter the contact name to search for: ");
        String name = sc.nextLine();
        Contacts oldContact = phone.queryContact(name);
        if (oldContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + oldContact.getName() + " phone number is: " + oldContact.getNumbers());
    }

}
