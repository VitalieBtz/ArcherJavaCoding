package week1;

public class divisionWithoutOperator {

    public static void main(String[] args) {

        int a = 17;
        int b = 3;
        int remainder = a%b;
        int count = 0;

        while( a > b){
            a +=-b;
            count++;
        }
        System.out.println("Devision is = " + count + "\nRemainder is = " + remainder);


    }
}
/*
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
 */