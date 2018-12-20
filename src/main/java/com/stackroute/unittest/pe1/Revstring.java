package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class Revstring {
    public static void main(String[] args) {
        Revstring obj = new Revstring();
        obj.reverseString();
    }
    void reverseString()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String a =scan.nextLine();
        char b[] = a.toCharArray();
        char c[] = new char[b.length];
        int g = b.length-1;
        for (int d=0;d<b.length;d++)
        {
            c[d]=b[g];
            g--;
        }
        String show = String.copyValueOf(c);
        System.out.println(show);

    }
}
