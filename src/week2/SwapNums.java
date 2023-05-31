package week2;

public class SwapNums {
    public static void main(String[] args) {

        int a = 5;
        int b = 9;

        a = a + b; //5+9=14
        b = a - b; //14-9 =5
        a = a - b; // 14-5 = 9

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }

}
/*
Swap two variables' values without using a third variable.
 */