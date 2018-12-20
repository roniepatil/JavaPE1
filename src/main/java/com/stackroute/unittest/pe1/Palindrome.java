package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to check palindrome");
        int num = scan.nextInt();

        obj.isPalindrome(num);
    }
    boolean isPalindrome(int num)
    {
        boolean answer=false;

        int remainder,originalInteger;
        int sum=0;
        int reversedinteger=0;


        originalInteger=num;
        while (num!=0){
            remainder=num%10;
            reversedinteger = reversedinteger*10+remainder;
            num=num/10;
        }
        num=originalInteger;
        remainder=0;
        if (originalInteger==reversedinteger) {
            System.out.println(originalInteger + " number is palindrome");
            answer=true;
            while (num != 0) {
                remainder = num % 10;
                if (remainder % 2 == 0) {
                    sum = sum + remainder;
                    num = num / 10;
                } else
                    num = num / 10;
            }

            if (sum < 25) {
                System.out.println("sum of even numbers is less than 25");
            } else
                System.out.println("sum of even numbers is greater than or equal to 25");
        }
        else {
            System.out.println(originalInteger + " number is not a palindrome");
            answer=false;
        }
        System.out.println(answer);
        return answer;
    }
}
