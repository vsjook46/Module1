/*
 * Classname Main
 * Version 1.8
 *
 * Copyright Ivan HOLOVEY
 *
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        byte years = 24;
        char letter = 'H';
        double height = 170.5;
        float weight = 66.5f;
        short hours = 2500;
        int distance = 1_000_000;
        long seconds2 = 120_000_000l;
        boolean isTrue = true;

        String aboutMyself = "My name is Ivan. Im am " + years + " years old.\n"
                + "The first letter of my surname is \"" + letter + "\". My height is "
                + height + ". My weight is " + weight + ". I spent almost " + hours
                + " to study English.\n Now I'm ready to go " + distance + " meters in distance."
                + seconds2 + " seconds in a run also prefered. " + "It is " + isTrue + ".";

        System.out.println(aboutMyself);
        System.out.println(aboutMyself.length());

    }
}