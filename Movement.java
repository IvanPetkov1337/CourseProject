package com.company;

import java.util.Random;
import java.util.Scanner;

public class Movement {
    private static final Random rand = new Random();
    private static final Scanner scanner = new Scanner(System.in);


    /***
     * Зар използван за pretty much висчко в програмата генериращ число от 1 до n
     */
    public static int dice(int value){
        int n = rand.nextInt(value);
        return n+1;

    }

    /***
     * Придвижване на играча
     */
    public static void movePlayer(players player){
        player.pos += Movement.dice(2);
    }
    public static boolean swapPlayers(boolean x){
       return x = !x;
    }

    /***
     * Информация за позицията на играча
     */
    public static void whereIsPlayer(players player, String [] arr, int index){
        String x;
        if (player.ID == 1)  x = "Player" ;
        else x = "Bot";
        System.out.println(   x + " e на позиция " + player.pos + " на поле " + arr[index] + "и разполага с " + player.money + " парички");
    }
}
