
/*
 * Classname Main
 * Version 1.8
 *
 * Copyright Ivan HOLOVEY
 *
 */
package com.company;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.Files.readAllLines;


public class Main {

    public static void main(String[] args) {
        
        List<String> lines = readAllLines(Paths.get(System.getProperty(
                "user.dir") + "/src/hurry.txt"),
                StandardCharsets.UTF_8);
        String text = lines.toString();

        String cleanedText = text.replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("\\?", "")
                .toLowerCase();

        String [] words = cleanedText.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        // 1.

        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()){
                longestWord = words[i];
            }
        }

        System.out.println("Longest word is " + longestWord);
        System.out.println("His lenght is " + longestWord.length());


        boolean isHarry = false;
        int linesWithHarry = 0;

        for (int i = 4; i < text.length(); i++) {
            if ((text.charAt(i-4) == 'H') && (text.charAt(i-3) == 'a')
                    && (text.charAt(i-2) == 'r') && (text.charAt(i-1) == 'r')
                    && (text.charAt(i) == 'y')) {
                isHarry = true;
            }
            if ((text.charAt(i) == '.') && (isHarry)){
                linesWithHarry++;
                isHarry = false;
            }
        }
        System.out.println("There are " + linesWithHarry +
                " lines where the word Harry is met");

        // 3. Масив

        String distinctString = "";

        for (int i = 0; i < words.length; i++) {
            if (!distinctString.contains(words[i])){
                distinctString += words[i] + " ";
            }
        }

        String [] distinctArray = distinctString.split(" ");

        Arrays.sort(distinctArray);

        // 3.

        int[] arrayOfHashes = new int [distinctArray.length];

        for (int i = 0; i < distinctArray.length; i++) {
            arrayOfHashes[i] = distinctArray[i].hashCode();
            System.out.println(arrayOfHashes[i]);
        }

        // 4. Хеші 

        int intersectionsCounter = 0;

        for (int i = 0; i < arrayOfHashes.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (arrayOfHashes[i] == arrayOfHashes[j]){
                    intersectionsCounter++;
                    arrayOfHashes[j] = NULL;
                }
            }
        }

        System.out.println(intersectionsCounter);

    }
}

    }
            }