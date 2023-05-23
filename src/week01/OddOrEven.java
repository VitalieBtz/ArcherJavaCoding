package week01;

public class OddOrEven {
    public static void main(String[] args) {

        System.out.println(isOdd(5));
        System.out.println(isEven(6));




    }
    public static boolean isOdd(int number){
        if (number %2 != 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isEven(int number){
        return !isOdd(number);
    }





}
/*
1️⃣  Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */


