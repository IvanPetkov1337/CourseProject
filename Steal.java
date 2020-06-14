package com.company;

public class Steal {
    /***
     * Присвояване на зъл план на играч
     * @param Number Избор на един от 3-те зли плана
     * @param player User/Bot parameters
     */
    public static void evilPlan(int Number ,players player){
        switch(Number){
            case 1 : evilPlan1(player);
                break;
            case 2 :evilPlan2(player);
                break;
            case 3 :evilPlan3(player);
                break;
        }
    }

    private static void evilPlan1(players player){
        player.evilPower1 = true;
    }

    private static void evilPlan2(players player){
        player.evilPower2 = true;
    }

    private static void evilPlan3(players player){
        player.evilPower3 = true;
    }

    public static void clearEvilPlan(players player){
        player.evilPower1 = false;
        player.evilPower2 = false;
        player.evilPower3 = false;
    }

    /***
     *Връща име на злият план
     */
    public static String printEvilPlan(int Number ){

        switch(Number){
            case 1 : return  "Завладяване на света";

            case 2 : return   "Заложници";

            case 3 : return  "Големият банков обир";

        }
        return "well shit";
    }

}
