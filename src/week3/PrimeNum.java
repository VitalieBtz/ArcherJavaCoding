package week3;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        boolean isPrime =true;
        for (int i = 2; i < num; i++) {
            if(num%i ==0) {
                isPrime= false;
            }
        }
        System.out.println("the number " + num + " isPrime:" +isPrime );


    }
}
/*
Write a method that can check if a number is prime or not.
 */