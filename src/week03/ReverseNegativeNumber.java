package week03;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        int x = -57;
        String rev = "" + x;
        String output ="";

        for (int i = rev.length()-1; i > 0 ; i--) {
            output += rev.charAt(i);
        }

        System.out.println(-Integer.parseInt(output));

    }
//----------------DIFFERENT APPROACH--------------------------------------

    public static int reverseNegNumber(int n){

        int reversed = 0;

        while(n != 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}
/*
 Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */
