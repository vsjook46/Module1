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

        String[] palindrons = new String[5];
        palindrons[0] = "Я иду с мечем судия";
        palindrons[1] = "Аргентина манит негра";
        palindrons[2] = "Не гни папин ген";
        palindrons[3] = "Она не жена, но...";
        palindrons[4] = "Лида! Ланцет отец наладил";

        for (int i = 0; i < 5; i++) {
            palindrons[i] = palindrons[i].replaceAll("[^A-Za-zА-Яа-я]", "");
            palindrons[i] = palindrons[i].toLowerCase();

            String template = "";
            for (int j = 0; j < palindrons[i].length(); j++) {
                int index = palindrons[i].length() - j - 1;
                template += palindrons[i].charAt(index);
            }

            System.out.println(template);

            //"Я иду с мечем судия"
            //"Аргентина манит негра"
            //"Не гни папин ген"
            //"Она не жена, но..."
            //"Лида! Ланцет отец наладил"

            if (palindrons[i].equals(template)) {
                System.out.println("The word is palindrons");
            } else {
                System.out.println("The word is not palindrons");
            }
        }
    }

}