package com.bharath.learning.core.collections.set.hashset;

import java.util.*;

public class WordFrequencyExample {

    public static void main(String[] args) {
        String sentence = "I am learning Java and Java is a programming language. I'm learning python too. This is a test.";

        String words[] = sentence.split(" ");

        System.out.println("Words: " + Arrays.deepToString(words));

        // unique words
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        System.out.println("Unique Words: " + uniqueWords);

        // word frequency
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
           if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
              } else {
                wordFrequency.put(word, 1);
           }
        }

        System.out.println("Word Frequency: " + wordFrequency);
    }
}
