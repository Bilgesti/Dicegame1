package com.bilgee.dicegame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    String name;
    int score;

    public static List<Player> addPlayer () {
        List<Player> playerList = new ArrayList<>();

        // Ask the user how many players
        Scanner in = new Scanner(System.in);
        System.out.println("How many players: ");
        int totalPlayers = in.nextInt();

        for (int p = 0; p < totalPlayers; p++) {

            // Create unique players
            System.out.println("Enter the name of the player: " + (p +1));
            String playerName = in.next();
            playerList.add( new Player( playerName ) );

        }
        return playerList;

    }


    public void addToScore(int totalScore) {
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
