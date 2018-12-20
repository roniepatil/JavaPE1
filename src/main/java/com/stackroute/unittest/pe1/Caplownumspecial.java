package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class Caplownumspecial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character");
        char characterentered = scan.next().charAt(0);
        Caplownumspecial obj = new Caplownumspecial();
        String answer = obj.isCapLowNumSpe(characterentered);
        System.out.println(answer);


    }
    public String isCapLowNumSpe(char characterentered)
    {
        if(characterentered>=65 && characterentered<=90)
        {
            return "uppercase";
        }
        else if (characterentered>=97 && characterentered<=122)
        {
            return "lowercase";
        }
        else if (characterentered>=48 && characterentered<=57)
        {
            return "digit";
        }
        else
        {
            return "symbol";
        }
    }
}
