package com.company;

import java.util.Scanner;

public class Game {
    final public static Scanner scanner = new Scanner(System.in);

    /***
     * Извежда победител в играта
     */
    public static void whoIsWinner(players player){
    String tempName;
    if (player.ID == 1)tempName = "Bot";
    else tempName = "Player";
    player.doesPlayerHaveAnyMoneyLeft = false;
    System.out.println("Победителят е " +  tempName + "! \n");
    System.out.println("Бихте ли искали да продължите? (yes)");

    }

    /**
     * Пита user-а дали иска да продължи
     */
    public static boolean GameOverQuestionMark(){
        String x;
        x = scanner.next();

        return x.contains("yes");
    }

}
