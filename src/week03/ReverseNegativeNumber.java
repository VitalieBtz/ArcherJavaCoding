package week03;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
        System.out.println(ReverseNegativeNumber.reverseNegative(-31));
        System.out.println(ReverseNegativeNumber.reverseNegative(-111));
        System.out.println(ReverseNegativeNumber.reverseNegative(-1213));
        System.out.println(ReverseNegativeNumber.reverseNegative(-62));
    }

    public static int reverseNegative(int n) {
        int reverseNum = 0;

        for (; n != 0; n = n / 10) {
            int remainder = n%10;
            reverseNum = remainder + reverseNum * 10;
        }

        return reverseNum;
    }
}
/*
 Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */
