package week3;

public class ReverseNegNum {

    public static void main(String[] args) {

        int x = -57;
        String rev = "" + x;
        String output ="";
        for (int i = rev.length()-1; i > 0 ; i--) {
            output += rev.charAt(i);
        }

        System.out.println(-Integer.parseInt(output));

    }
}
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */