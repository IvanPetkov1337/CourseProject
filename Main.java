package com.company;

import java.util.Scanner;

/***
 * @author Ivan Petkov
 * Course Project (TODO:finish/refactor this summer)
 */

public class Main {
 final public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String[] PlayBoard = new String[20];
        boolean isGameActive = true;

        do {
            PlayBoard = Board.defaultArray(PlayBoard);
            Board.shuffle(PlayBoard);
            players Player = new players();
            Player.ID = 1;
            players Bot = new players();
            Bot.ID = 2;
            int GameCycle = 1;


            int Turn = Movement.dice(2);
/***
 * Main logic
 */
            while (Player.doesPlayerHaveAnyMoneyLeft && Bot.doesPlayerHaveAnyMoneyLeft) {


                while (Player.pos < 19 && Bot.pos < 19) {
                    switch (Turn) {

                        //PLAYER
                        case 1:

                            if (Player.pos < 19) {
                                Movement.movePlayer(Player);
                                if (Player.pos > 19) Player.pos = 19;
                                Board.renderBoard(PlayBoard);
                                Movement.whereIsPlayer(Player, PlayBoard, Player.pos);
                                switch (PlayBoard[Player.pos]) {
                                    case "|T |":
                                        Traps.print();
                                        Traps.trapSwitchCase(Traps.takeInput(), Player);
                                        break;

                                    case "|C |":
                                        if (Player.evilPower1) {
                                            System.out.println("Вие реализирахте своят зъл план и за това получавате +100 парички \n");
                                            Player.money += 100;
                                            Steal.clearEvilPlan(Player);
                                        }
                                        int GoodOrBadDice = Movement.dice(10);
                                        if (GoodOrBadDice % 2 == 0) {
                                            Chance.GoodChanceSwitchCase(Movement.dice(100), Player);
                                        } else {
                                            Chance.BadChanceSwitchCase(Movement.dice(100), Player);
                                        }
                                        break;

                                    case "|St|":
                                        if (Player.evilPower2) {
                                            System.out.println("Вие реализирахте своят зъл план и за това получавате +100 парички \n");
                                            Player.money += 100;
                                            Steal.clearEvilPlan(Player);
                                        }

                                        int Evil = Movement.dice(3);
                                        System.out.println("Вече разполагате със злия план : " + Steal.printEvilPlan(Evil) + "\n");
                                        Steal.evilPlan(Evil, Player);
                                        break;

                                    case "|P |": System.out.print("Купонясвахте цяла вечер и за да платите за алкохола губите 25 парички! \n");
                                        Player.money -= 25;
                                        break;


                                    case "|I |": if (Player.evilPower3) {
                                        System.out.println("Вие реализирахте своят зъл план и за това получавате +100 парички \n");
                                        Player.money += 100;
                                        Steal.clearEvilPlan(Player);
                                    }
                                   // Invest.printCaseInvest(Invest.takeInvestCaseInput());



                                        break;



                                }
                                Turn = 2;
                                break;
                            }


                            //BOT
                        case 2:
                            if (Bot.pos < 19) {
                                Movement.movePlayer(Bot);
                                if (Bot.pos > 19) Bot.pos = 19;
                                Board.renderBoard(PlayBoard);
                                Movement.whereIsPlayer(Bot, PlayBoard, Bot.pos);
                                switch (PlayBoard[Bot.pos]) {
                                    case "|T |":
                                        Traps.print();
                                        Traps.trapSwitchCase(Movement.dice(6) - 1, Bot);
                                        break;

                                    case "|C |":
                                        if (Bot.evilPower1) {
                                            System.out.println("Вие реализирахте своят зъл план и за това получавате +100 парички \n");
                                            Bot.money += 100;
                                            Steal.clearEvilPlan(Bot);
                                        }
                                        int GoodOrBadDice = Movement.dice(10);
                                        if (GoodOrBadDice % 2 == 0) {
                                            Chance.GoodChanceSwitchCase(Movement.dice(100), Bot);
                                        } else {
                                            Chance.BadChanceSwitchCase(Movement.dice(100), Bot);
                                        }
                                        break;

                                    case "|St|":
                                        if (Bot.evilPower2) {
                                            System.out.println("Вие реализирахте своят зъл план и за това получавате +100 парички \n");
                                            Bot.money += 100;
                                            Steal.clearEvilPlan(Bot);
                                        }

                                        int Evil = Movement.dice(3);
                                        System.out.println("Вече разполагате със злия план : " + Steal.printEvilPlan(Evil) + "\n");
                                        Steal.evilPlan(Evil, Bot);
                                        break;

                                    case "|P |": System.out.print("Купонясвахте цяла вечер и за да платите за алкохола губите 25 парички! \n");
                                        Bot.money -= 25;
                                    break;

                                    case "|I |": if (Bot.evilPower3) {
                                        System.out.println("Вие реализирахте своят зъл план и за това получавате +100 парички \n");
                                        Bot.money += 100;
                                        Steal.clearEvilPlan(Bot);
                                    }
                                      //  Invest.printCaseInvest(Invest.takeInvestCaseInput());
                                }
                            }
                            Turn = 1;
                            break;
                    }

                }

                Board.shuffle(PlayBoard);
                Board.renderBoard(PlayBoard);
                Player.pos = 0;
                Bot.pos = 0;
                GameCycle++;
                System.out.println("\nНастоящ цикъл на играта :" + GameCycle);


                if (Player.money <= 0) {
                    Game.whoIsWinner(Player);
                    if (!Game.GameOverQuestionMark()) isGameActive = false;
                }

                if (Bot.money <= 0) {
                    Game.whoIsWinner(Bot);
                    if (!Game.GameOverQuestionMark()) isGameActive = false;
                }

            }
        }while(isGameActive);
        System.out.println("Благодаря, че играхте играта ми! :)");
    }


}









