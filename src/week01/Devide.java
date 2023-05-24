package week01;

import java.util.Arrays;

public class Devide {
    public static void Divide(int number1, int number2) {

        int count = 0;

        while (number1 >= number2) {
            number1 -= number2;
            count++;
        }

        System.out.println(count + " with a remainder of " + number1);
    }

    //        ------------------------------------------------------------------------------------------------------------------------
    public static double divideWoOperator(double dividend, double divisor) {

        int result = 0;
        int sign = dividend <= 0 && divisor < 0 || dividend >= 0 && divisor > 0 ? 1 : -1; //  negative or positive result

        if (divisor == 0) {
            throw new ArithmeticException("divisor can not be 0");
        }

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (dividend >= divisor) {
            dividend -= divisor;
            result++;
        }

        double decimalCount = 0;

        if (dividend > 0) {
            dividend = dividend * 100;
        }
        while (dividend >= divisor) {
            dividend -= divisor;
            decimalCount += 0.01;
        }

        return (result + decimalCount) * sign;
    }


}