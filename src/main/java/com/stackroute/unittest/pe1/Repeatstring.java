package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class Repeatstring {
    public static void main(String[] args) {
        Repeatstring obj = new Repeatstring();
        obj.printRepeated();
    }
    void printRepeated()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give input 1 : Name : ");
        String name = scan.nextLine();
        System.out.println("Give input 2 : Number : ");
        int num = scan.nextInt();
        int a = name.length();
        int b = a-num;
        char f[] = new char[name.length()];
        f=name.toCharArray();
        char g[] = new char[num];
        int st=0;
        for (int d=b;d<name.length();d++)
        {
            g[st]=f[d];
            st++;
        }
        String total = String.copyValueOf(g);
        for (int t=0;t<num;t++)
        {
            name=name+total;
        }
        System.out.println(name);
    }
}
