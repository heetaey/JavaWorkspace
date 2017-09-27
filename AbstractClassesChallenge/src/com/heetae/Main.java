package com.heetae;

public class Main {

    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        //list.traverse(list.getRoot());
        // Create a string data array to avoid typing loads of addItem instructions:
        //String stringData = "5 7 3 9 8 2 1 0 4 6";

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");

        for (String s : data) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
//        list.removeItem(new Node("3"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("5"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("0"));
//        list.removeItem(new Node("4"));
//        list.removeItem(new Node("2"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("9"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("8"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("6"));
//        list.traverse(list.getRoot());
//        list.removeItem(list.getRoot());
//        list.traverse(list.getRoot());
//        list.removeItem(list.getRoot());
//        list.traverse(list.getRoot());
    }
}
