
/*
 * Classname Main
 * Version 1.8
 *
 * Copyright Ivan HOLOVEY
 *
 */
package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths
                .get("C:\\Users\\MyPC\\IdeaProjects\\Task №4. Array\\src\\com\\company\\harry.txt")));

        String cleanedText = text.replaceAll("[^A-Za-zА-Яа-я]", " ");
        cleanedText = cleanedText.toLowerCase();

        String[] words = cleanedText.split(" ");

        String distinctString = "";

        for (int i = 0; i < words.length; i++) {
            if (!distinctString.contains(words[i])){
                distinctString += words[i] + " ";
            }
        }

        String [] distinctArray = distinctString.split(" ");

        Arrays.sort(distinctArray);

        for (int i = 0; i < distinctArray.length; i++) {
            System.out.println(distinctArray[i]);
        }
    }
}