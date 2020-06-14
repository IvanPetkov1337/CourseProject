package com.company;


import java.util.Scanner;

public class Invest {
    final public static Scanner scanner = new Scanner(System.in);

    /*public String[] InvestField = new String[] {"Evel_Co" ,"Bombs_Away" , "Clock_Work_Orange"
                                    ,"Maroders_unated" , "Fatcat_incorporated", "Macrosoft" };*/


    /***
     * Визуализира случайни 3 case-a
     * @param Number random number between 1-6
     */
    public static void printCaseInvest(int Number){
            System.out.print("Инвестирайте разумно и изберете компания \n");
            for(int i = 1 ; i < 4 ; i++ ) {
                System.out.print(i);
                switch (Movement.dice(6)) {
                    case 1 -> System.out.print(": Evel Co | min : 500 | risk/reward : 0.2 \n");
                    case 2 -> System.out.print(": Bombs Away | min : 400 | risk/reward : 0.5\n");
                    case 3 -> System.out.print(": Clock Work Orange | min : 300 | risk/reward : 1.5\n");
                    case 4 -> System.out.print(": Maroders unated | min : 20 | risk/reward : 2.0\n");
                    case 5 -> System.out.print(": Fatcat incorporated | min : 100 | risk/reward : 2.5\n");
                    case 6 -> System.out.print(": Macrosoft | min : 50 | risk/reward : 5.0\n");
                }
            }


    }

    /***
     * user input for Invest logic
     * @return value 1-3
     */
    public static int takeInvestCaseInput(){
        int x = 0;
        do{
           x =  scanner.nextInt();
        }while(x < 0 || x > 4);

        return x;
    }



}
