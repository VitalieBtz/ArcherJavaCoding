package week02;

public class swapNumbers {

    public static void swapNumbers(int a, int b){

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + "\nb = " + b);
    }
}
/*
 Numbers – Swap Numbers
Swap two variables' values without using a third variable.
 */
