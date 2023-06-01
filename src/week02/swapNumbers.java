package week02;

public class swapNumbers {

    public static void swapNumbers(int x, int y){

        // int x = 5;
        // int y = 10;

        x = x + y;      // 5 + 10 = 15.                 x = 15
        y = x - y;      // 15 - 10 = 5.                 y = 5
        x = x - y;      // 15 - 5 = 10.                 x = 10

        System.out.println("x =  " + x);
        System.out.println("y =  " + y);

    }
}
/*
 Numbers – Swap Numbers
Swap two variables' values without using a third variable.
 */
