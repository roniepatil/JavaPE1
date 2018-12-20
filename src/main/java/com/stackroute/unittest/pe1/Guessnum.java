package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class Guessnum {
    public static void main(String[] args) {

    Guessnum obj = new Guessnum();
    obj.guessNumber();

    }
    void guessNumber()
    {

        while (true)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Guess number between 1 to 100");
            int b = scan.nextInt();
            numberRight(b);

        }
    }
    String numberRight(int b)
    {
        int target=85;
        if (b==target)
        {
            System.out.println("You have guessed right number");
            return "right";
        }
        else if (b<target)
        {
            System.out.println("The number you have guessed is less target number");
            return "less";
        }
        else if (b>target)
        {
            System.out.println("The number you have guessed is greater target number");
            return "greater";
        }
        else
        {
            System.out.println("Wrong number, guess again !");
            return "wrong";
        }
    }
}
