package com.bilgee.dicegame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    // Ask the user how many dice
    public static int askNumberDice (){
        Scanner in = new Scanner(System.in);
        System.out.println("How many dice: ");
        return in.nextInt();
    }
    // Dice random numbers between 1-6
    public static int diceThrow (int dice, Random random){
        int totalScore = 0;
        for (int d = 0; d < dice; d++){
            int diceThrow = random.nextInt(6)+1;
            totalScore += diceThrow;
        }
        return totalScore;
    }
    public static int askNumberRounds (){
        Scanner in = new Scanner(System.in);
        // Ask the user how many rounds
        System.out.println("How many rounds: ");
        return in.nextInt();
    }
    public static void playGame (List<Player> playerList, int rounds, int dice){
        Random random = new Random ();
                // Rounds
        for( int round = 1 ; round <= rounds; round++) {
            System.out.println("Round:" +1);
        }
        for (Player player : playerList){
            int totalScore = diceThrow( dice,random );
            player.addToScore(totalScore);
            System.out.println(player.getName() + " 's score: " + player.getScore());


        }
    }
    public static List<Player> findWinners (List<Player> playerList){
        List<Player> winner = new ArrayList<>();
        int maxScore = Integer.MIN_VALUE;

        for (Player player : playerList){
            if (player.getScore() > maxScore){
                winner.clear();
                maxScore = player.getScore();
                winner.add( player );
            } else if (player.getScore() == maxScore)
                winner.add( player );
            }
            return winner;
        }
    public static void showWinners (List<Player> playerList){
        List<Player> winners = findWinners( playerList );

        if (winners.size() == 1) {
            Player winner = winners.get(0);
            System.out.println("The winner is: " + winner.getName() + " with a score of " + winner.getScore());

        }else {
            System.out.println("It's tie between the following players: ");
            for (Player winner : winners){
                System.out.println(winner.getName() + " with a score of " + winner.getScore());
            }
        }
    }

    }



