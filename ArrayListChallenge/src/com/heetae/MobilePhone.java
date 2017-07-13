package com.heetae;

import java.util.ArrayList;

/**
 * Created by hsMacbook on 2017. 7. 12..
 */
public class MobilePhone {
    private ArrayList<Contacts> contacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<>();
    }

    public boolean addNewContact(Contacts newContact) {
        if (this.contacts.contains(newContact)) {
            System.out.println("The contact already exists. Try again.");
            return false;
        } else {
            this.contacts.add(newContact);
            return true;
        }
    }

    public boolean modifyContacts(Contacts oldContacts, Contacts newContacts) {
        int position = findItem(oldContacts);
        if (position >= 0) {
            this.contacts.set(position, newContacts);
            System.out.println("The original contact " + oldContacts.getName() + " has been modified to " + newContacts.getName());
            return true;
        } else {
            System.out.println("The contact isn't found. Try again");
            return false;
        }

    }

    public boolean removeContacts (Contacts contact) {
        int position = findItem(contact);
        if (position < 0) {
            System.out.println("The contact doesn't exist. Try again.");
            return false;
        } else {
            contacts.remove(position);
            System.out.println("Contact has been removed.");
            return true;
        }
    }

    private int findItem (Contacts contactName) {
        return this.contacts.indexOf(contactName);
    }

    private int onList (String contactName) {
        for (int i = 0; i < contacts.size(); i++) {
            Contacts contacts = this.contacts.get(i);
            if (contacts.getName().equalsIgnoreCase(contactName)) {
                return i;
            }
        }
        return -1;

    }

    public void printContacts() {
        System.out.println("Here's the following list of your contacts");
        for (int i = 0; i < contacts.size(); i++) {
            String name = contacts.get(i).getName();
            String number = contacts.get(i).getNumbers();
            System.out.println("Name: " + name + " ----> Number: " + number);
        }
    }

    public String queryContact (Contacts contact) {
        if (findItem(contact) > 0) {
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact (String contact) {
        int position = onList(contact);
        if (position >= 0) {
            return this.contacts.get(position);
        }
        return null;
    }

}
