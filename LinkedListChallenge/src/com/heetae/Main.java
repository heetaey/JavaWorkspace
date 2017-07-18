package com.heetae;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("StormBringer", "Deep Purple");
        album.addSongs("Stormbringer", 4.5);
        album.addSongs("Love don't mean a thing", 4.22);
        album.addSongs("Holy man", 4.3);
        album.addSongs("Hold on", 5.6);
        album.addSongs("Lady double dealer", 3.21);
        album.addSongs("You can't do it right", 6.23);
        album.addSongs("High ball Shooter", 4.27);
        album.addSongs("The gypsy", 4.5);
        album.addSongs("Soldier of Fortune", 4.5);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed King", playList); //which doesnt exists;
        albums.get(0).addToPlayList(9, playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("The playlist is empty. Try again.");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        printMenu();

        while (!quit) {
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.hasNext();
                        }
                        forward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("End of the playlist reached.");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Beginning of the playlist.");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list.");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list.");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Available Actions: ");
        System.out.println("0 -- to quit \n" +
                            "1 -- to play next song \n" +
                            "2 -- to play previous song \n"+
                            "3 -- to replay the current song \n" +
                            "4 -- list songs in the playlist \n" +
                            "5 -- print available actions \n" +
                            "6 -- delete current song from the playlist.");
    }

    private static void printList(List<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=========================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=========================");
    }


}
