package com.heetae;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("heetae", 10, 15);
        System.out.println(player.toString());
        saveObject(player);

        player.setHitPoints(8);
        System.out.println(player);
        player.setWeapon("shotgun");
        saveObject(player);
        //readObject(player);
        System.out.println(player);

        Storage monster = new Monster("Werewolf", 20, 40);
        System.out.println("Strength = " + ((Monster) monster).getStrength());
        //System.out.println(monster);
        saveObject(monster);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(Storage objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");

        }
    }

    public static void readObject(Storage objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
