package com.stackroute.unittest.pe1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NonIncre {
    public static void main(String[] args) {
        NonIncre obj = new NonIncre();
        obj.sortDecreasing();
    }
    void sortDecreasing()
    {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the number");
        String numString = scan.nextLine();
        String finalword = nonIncreasing(numString);
        System.out.println(finalword);

    }
    String nonIncreasing(String numString)
    {
        Integer sum=0;
        String answer="";
        boolean state = false;
        char numChar[] = numString.toCharArray();
        Integer numInt[] = new Integer[numChar.length];
        for (int x=0;x<numChar.length;x++)
        {
            numInt[x]=Character.getNumericValue(numChar[x]);
        }
        Arrays.sort(numInt, Collections.reverseOrder());
        for (int z=0;z<numChar.length;z++)
        {
            if (numInt[z]%2==0)
            {
                sum = sum + numInt[z];
            }
        }
        System.out.print("Sorted number in non-increasing order :");
        for (int v=0;v<numChar.length;v++)
        {
            System.out.print(numInt[v]);
            //answer.concat(String.valueOf(numInt[v]));
            //System.out.println(answer);
        }

        System.out.println("\n Sum of even numbers is: "+sum);
        if (sum>15)
        {
            state=true;
        }
        System.out.println("Is sum greater than 15: "+state);
        System.out.println(answer);
        return answer;
    }
}
