package week02;

public class swapNumbers {

    public static void main (String [] args){

        int num1 = 8;
        int num2 = 5;

        num1 = num1 + num2;
        //      8      5   = 13 == > num1
        num2 = num1 - num2;
        //      13  - 5    =  8 ==> num2
        num1 = num1 - num2;
        //     13   -  8   =  5 ==> num1

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }
}
/*
 Numbers – Swap Numbers
Swap two variables' values without using a third variable.
 */
