package week03;


public class ReverseNumber {
    public static void main(String[] args) {

        int given = -35;
        int output = 0;

        while(given != 0){

            int num = given % 10;
            output = output * 10 + num;
            given /= 10;
        }

        System.out.println(output);









        }
    }
