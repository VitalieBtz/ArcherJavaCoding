package week2;

public class SwapNumbers {

    public static void main(String[] args) {


        int x = 5;
        int y = 10;


        x = x + y;      // 5 + 10 = 15                x = 15
        y = x - y;      // 15 - 10 = 5.                 y = 5
        x = x - y;      // 15 - 5 = 10.                 x = 10

        System.out.println("X is: " + x);
        System.out.println("Y is: " + y);
    }
}
/*
Swap two variables' values without using a third variable.
 */