package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class Revstring {
    public static void main(String[] args) {
        Revstring obj = new Revstring();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String string =scan.nextLine();
        obj.reverseString(string);
    }
    String reverseString(String string)
    {

        char b[] = string.toCharArray();
        char c[] = new char[b.length];
        int g = b.length-1;
        for (int d=0;d<b.length;d++)
        {
            c[d]=b[g];
            g--;
        }
        String show = String.copyValueOf(c);
        System.out.println(show);
        return show;

    }
}
