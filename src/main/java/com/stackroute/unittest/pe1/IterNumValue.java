package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class IterNumValue {
    public static void main(String[] args) {
        int num;
        IterNumValue obj = new IterNumValue();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number value");
        num=scan.nextInt();
        System.out.println(obj.repeatNumberNTimes(num));

    }
    String repeatNumberNTimes(int num)
    {

        int first,second;
        String conOfLetters="";


        for (first=1;first<=num;first++)
        {
            for (second=1;second<=first;second++)
            {
                conOfLetters=conOfLetters.concat(Integer.toString(first));
            }
        }
        return conOfLetters;
    }
}
