package CourseWork;

import java.util.Random;
import java.util.Scanner;

public class Movement {
    private static Random rand = new Random();
    private static Scanner scanner = new Scanner(System.in);


    public static int decisionDice(int value ){

        int n = rand.nextInt(value);
        return n+1;
    }
    public static int movementDice(){
        int n = rand.nextInt(2);
        return n+1;
    }
}
