package week05;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your example: ");
        String ex = input.next();

        String result = "";

        for (int i = ex.length()-1; i >= 0; i--) {

            result += ex.charAt(i) + "";

        }

        System.out.println(result);


    }

}
/*
String -- Reverse
 Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */
