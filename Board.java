package com.company;

import java.util.Random;

public class Board {


    /***
     * Задаване на default масив
     */
    public static String[] defaultArray(String[] array){
         return array = new String[]{"|S |", "|T |", "|T |", "|T |", "|T |", "|T |", "|T |", "|T |", "|St|", "|St|", "|St|", "|I |", "|I |", "|I |", "|C |", "|C |", "|C |", "|P |", "|P |", "|P |"};
    }

    /***
     * разместване на местата на game board-а
     * @param array приема масив
     */
    public static void shuffle(String[] array){
        Random rand = new Random();

        for (int i = 1; i < array.length; i++) {
            int randI = rand.nextInt(array.length-1)+1;
            String temp = array[randI];
            array[randI] = array[i];
            array[i] = temp;
        }
    }

    /***
     * извежда масив под форма на game board*
     * @param array
     */
    public static void renderBoard(String[] array){
            System.out.println(array[10] + array[11] + array[12] + array[13] + array[14] + array[15] + array[16] + array[17] + "\n" +
                              array[9] + "                        " + array[18] + "\n" +
                              array[8] + "                        " + array[19] + "\n" +
                              array[7] + array[6] + array[5] + array[4] + array[3] + array[2] + array[1] + array[0]);
        }

    }



