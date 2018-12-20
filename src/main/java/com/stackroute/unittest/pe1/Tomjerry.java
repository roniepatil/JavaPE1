package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class Tomjerry {
    public static void main(String[] args) {
        Tomjerry obj = new Tomjerry();
        obj.isTomOrJerry();

    }
    void isTomOrJerry()
    {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        num = scan.nextInt();
        if (num%2==0 && num>20 && num<30)
        {
            System.out.println("Jerry");
        }
        else if (num%2!=0 && num>20 && num<30)
        {
            System.out.println("Tom");
        }
        else
        {
            System.out.println("Number is not in between 20 & 30");
        }
    }
}
