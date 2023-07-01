package week06;

public class SumOfAllDigits {

    public static int sumOfAllDigits(String str){

        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++){

            char each = str.charAt(i);

            if (each >= '0' && each <= '9'){
                num += each;

                if (each == str.length()-1 || !(str.charAt(i+1) >= '0' && str.charAt(i+1) <= '9')){
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        return sum;
/*
        int sum = 0;

        for (int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9'){
                /*
                To convert char to number: (see ASCII Table)
			        '0' - 48   ==> 0
				    '1' - 48   ==> 1
                 //
                sum += ch - 48;
            }
        }
        return sum;
*/
    }
}
/*
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */
