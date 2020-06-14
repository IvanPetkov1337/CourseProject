package com.company;

public class Chance {


    private static void goodChance1(players player){
        System.out.println("Големите надежди! +50 парички! ");
        player.money += 50;
    }
    private static void goodChance2(players player){
        System.out.println("Лолита! +100 парички! ");
        player.money += 100;
    }
    private static void goodChance3(players player){
        System.out.println("Гордост и предразсъдъци! +150 парички! ");
        player.money += 150;

    }
    private static void goodChance4(players player){
        System.out.println("Повелителя на мухите! +200 парички! ");
        player.money += 200;
    }
    private static void goodChance5(players player){
        System.out.println("Хобит! +250 парички! ");
        player.money += 250;
    }



    private static void badChance1(players player){
        System.out.println("1001 нощ! -50 парички! ");
        player.money -= 50;
    }
    private static void badChance2(players player){
        System.out.println("Балът на феите! -100 парички! ");
        player.money -= 50;
    }
    private static void badChance3(players player){
        System.out.println("Война и мир! -150 парички! ");
        player.money -= 50;
    }
    private static void badChance4(players player){
        System.out.println("Престъпление и наказание! -200 парички! ");
        player.money -= 50;

    }
    private static void badChance5(players player){
        System.out.println("Гроздовете на гнева! -250 парички! ");
        player.money -= 50;
    }




    public static void GoodChanceSwitchCase(int Number, players player){
     if(Number > 0 && Number < 40){
         goodChance1(player);
     }

     if(Number > 39 && Number < 66){
         goodChance2(player);
     }

     if(Number > 66 && Number < 80){
         goodChance3(player);
     }

     if(Number > 79 && Number < 95){
         goodChance4(player);
     }

     if(Number > 96 && Number < 101){
         goodChance5(player);
     }
 }



    public static void BadChanceSwitchCase(int Number, players player){
        if(Number > 0 && Number < 40){
            badChance1(player);
        }

        if(Number > 39 && Number < 66){
            badChance2(player);
        }

        if(Number > 66 && Number < 80){
            badChance3(player);
        }

        if(Number > 79 && Number < 95){
            badChance4(player);
        }

        if(Number > 96 && Number < 101){
            badChance5(player);
        }
    }
}
