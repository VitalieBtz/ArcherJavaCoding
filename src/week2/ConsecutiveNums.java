package week2;

import java.util.Scanner;

public class ConsecutiveNums {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter the max number:");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {

            //  2 3 5 Codility, Test, Coders
            if (i % 30 == 0) {
                System.out.println(" Codility,Test, Coders");
            } else if (i % 15 == 0) {
                System.out.println(" Test, Coders");
            } else if (i % 10 == 0) {
                System.out.println(" Codility, Coders");
            } else if (i % 6 == 0) {
                System.out.println(" Codility, Test");
            } else if (i % 5 == 0) {
                System.out.println(" Coders");
            } else if (i % 3 == 0) {
                System.out.println(" Test");
            } else if (i % 2 == 0) {
                System.out.println(" Codility");
            } else {
                System.out.println(" " +i);
            }

        }

    }


}
/*
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words
Codility, Test and Coders in this given order.
EX:
Numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three
numbers, 2,3 and 5, should be replaced by CodilityTestCoders.
 */


