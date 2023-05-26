package week1;

public class OddOrEven {

    public static String identify(int x){

        if(x == 0){
            return "Do not enter zero";
        }else if(x %2 == 0){
            return x + " is even number";
        }else{
            return x + " is odd number";
        }

    }

    public static void main(String[] args) {

        System.out.println(identify(89));



    }
}
/*
Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */