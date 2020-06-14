package com.company;

import java.util.Scanner;

public class Traps {
    private static final Scanner scanner = new Scanner(System.in);



    public static void DanuchnaReviziq(players players){
       players.invest *= 0.9;
    }
    public static void RazvodPoKoteshki(players players){
        int x = Movement.dice(10);
        if(x == 2 || x == 8) players.invest = 0;
    }
    public static void Propaganda(players players){
        players.canSetTraps = false ;
    }



    public static void print(){
        System.out.println("0. Не, благодаря, не вярвам в злото\n" +
                "1. Данъчна ревизия :" + " Губите 10 процента от всичките" +
                "си приходи в край на цикъла. /// ИНВЕСТИЦИЯ : 100\n" +
                        "2 .Развод по котешки :" + "В края на цикъла , играта" +
                        "хвърля 10-стенен зар,\n ако " +
                        "стойността е 2 или 8, не" +
                        "получава печалба от цикъла" +
                        "(ако има такава) /// ИНВЕСТИЦИЯ : 200\n" +
                        "3. Пропаганда:" + "Не можете да поставяте повече капани в рамките на текущия цикъл /// ИНВЕСТИЦИЯ : 100\n" +
        "4. Проглеждане: " + "При попадане, на следващо квадратче Steel играчът губи право да реализира зъл план. /// ИНВЕСТИЦИЯ : 50\n" +
        "5. Хазартен бос: " + "Следващото квадратче Шанс ви носи само негативни последици. /// ИНВЕСТИЦИЯ : 100\n" +
                "Изберете опция : \n");

    }

    /***
     * user input
     */
    public static int takeInput(){
        int x;
        do {
            x = scanner.nextInt();
        }while(x < 0 || x > 5);
        return x;
    }

    /***
     * Избор на trap
     */
    public static void trapSwitchCase (int Number, players player){
        switch(Number){
            case 0 : break;
            case 1 : player.money -= 100; break;
            case 2 : player.money -= 200; break;
            case 3 : player.money -= 100; break;
            case 4 : player.money -=  50; break;
            case 5 : player.money -= 100; break;
        }
    }
}

