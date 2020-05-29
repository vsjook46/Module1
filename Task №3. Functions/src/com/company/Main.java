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

        double start = 0;
        double finish = Math.PI;
        double deltaX = 0.1;
        double y = 0.4; // 0.4 своє значення дня народження

        double area = 0;

        for (double x = 0; x < finish; x+= deltaX) {
            double rectangle = 0;

            if (Math.sin(x) < y ) { // 0.4 своє значення
                rectangle = Math.sin(x) * deltaX;
            } else {
                rectangle = y * deltaX;
            }
            
            area += rectangle;

        }

        System.out.println(area);
    }
}