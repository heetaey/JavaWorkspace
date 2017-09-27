package com.heetae;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        uniqueChar("abcdefghijklmnopqrsty");
    }

    public static boolean uniqueChar(String str) {
        HashSet<Character> unique = new HashSet<Character>();
        for(int i=0; i<str.length();i++){
            unique.add(str.charAt(i));
        }
        if(unique.size()!=str.length()){
            System.out.println("no");
            return false;

        }
        System.out.println("yes");
        return true;
    }

    public static void replaceSpace (char[] array, int length) {
        final char SPACE = ' ';

        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] == SPACE) {
                spaceCount++;
            }
        }

        int resultLength = length + spaceCount * 2;
        for (int i = resultLength - 1; i >=0; i --) {

        }

    }
}
