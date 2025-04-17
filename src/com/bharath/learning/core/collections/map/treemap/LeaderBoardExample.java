package com.bharath.learning.core.collections.map.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class LeaderBoardExample {

    public static void main(String[] args) {

        Map<Integer, String> leaderboard = new TreeMap<>(Comparator.reverseOrder());

        leaderboard.put(100, "Alice");
        leaderboard.put(200, "Bob");
        leaderboard.put(150, "Charlie");
        leaderboard.put(250, "David");
        leaderboard.put(50, "Eve");
        leaderboard.put(300, "Frank");

        // Displaying the leaderboard
        System.out.println("Leaderboard (Sorted by Score):");
        System.out.println("--------------------------------");
        for (Map.Entry<Integer, String> entry : leaderboard.entrySet()) {
            System.out.println("Score: " + entry.getKey() + ", Player: " + entry.getValue());
        }
    }
}
