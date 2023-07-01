package week6;


public class SumOfAllDigit {

    public static void main(String[] args) {

        String str = "12 java 5 apple 3";
        int sum =0;

       String[] words = str.split(" ");

        for (String each : words ) {
            try{
                 sum += Integer.parseInt(each);
            }
            catch (NumberFormatException e) {
                System.out.println("Entered value is not a number. Value: "+each);
            }

        }
        System.out.println("sum of all digits in the text is : " +sum);

    }


}

/*
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */

