package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class Tomjerry {
    public static void main(String[] args) {
        Tomjerry obj = new Tomjerry();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        obj.isTomOrJerry(num);

    }
    String isTomOrJerry(int num)
    {


        if (num%2==0 && num>20 && num<30)
        {
            System.out.println("Jerry");
            return "jerry";
        }
        else if (num%2!=0 && num>20 && num<30)
        {
            System.out.println("Tom");
            return "tom";
        }
        else
        {
            System.out.println("Number is not in between 20 & 30");
            return "notinrange";
        }
    }
}
