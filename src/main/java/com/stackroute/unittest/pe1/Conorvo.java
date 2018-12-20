package com.stackroute.unittest.pe1;
import java.util.Scanner;

public class Conorvo {
    public static void main(String[] args) {
        String word;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
        word = scan.nextLine();
        Conorvo obj = new Conorvo();
        obj.isConsonantOrVowel(word);

    }
    void isConsonantOrVowel(String word)
    {
        char charsequence[];
        charsequence=word.toCharArray();

        for (int b=0;b<charsequence.length;b++)
        {
            String answer = checkCharacter(charsequence[b]);
            System.out.println(answer);
        }
    }
    String checkCharacter(char letter)
    {
        if (letter>='a' && letter<='z' || letter>='A' && letter<='Z') {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                //System.out.println(letter[b] + " is a vowel");
                return "vowel";
            }
            else {
                //System.out.println(letter[b] + " is a consonant");
                return "consonant";
            }
        }
        else
        {
            //System.out.println(letter[b]+" is not a letter");
            return "notletter";

        }
    }
}
