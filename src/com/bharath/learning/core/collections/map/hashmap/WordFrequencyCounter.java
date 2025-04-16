package com.bharath.learning.core.collections.map.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String text = "Hello world! Hello everyone. Welcome to the world of Java programming. Java is great!";

        System.out.println("Acutal text: " + text);
        String [] words = text.split(" ");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequencyMap = new LinkedHashMap<>();

        // Iterate through the words and count their frequencies
        for (String word : words) {

            if (wordFrequencyMap.containsKey(word)) {
                int currentCount = wordFrequencyMap.get(word);
                wordFrequencyMap.put(word, currentCount + 1);
            } else {
                wordFrequencyMap.put(word, 1);
            }

        }

        // Display the word frequencies
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("Character Frequencies:");
        Set<String> filteredWords = wordFrequencyMap.keySet();

        for (String word : filteredWords) {
            Map<Character, Integer> charFrequencyMap = new LinkedHashMap<>();
            char[] characterArray = word.toCharArray();
            for (char ch : characterArray) {
                if (charFrequencyMap.containsKey(ch)) {
                   int count =  charFrequencyMap.get(ch);
                     charFrequencyMap.put(ch, count + 1);
                } else {
                    charFrequencyMap.put(ch, 1);
                }
            }

            System.out.println("word: " + word);
            for (Map.Entry<Character, Integer> entry :  charFrequencyMap.entrySet()) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        }
    }
}
