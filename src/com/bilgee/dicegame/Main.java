package com.bilgee.dicegame;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the game!!!");

        List<Player> playerList = Player.addPlayer();
        int rounds = Game.askNumberRounds();
        int numberOfDice = Game.askNumberDice();

        Game.playGame( playerList,rounds,numberOfDice );
        Game.showWinners(playerList);


    }
}























