package interview_coding_tasks.week03;

public class ReverseTheNumber {
    public static void main(String[] args) {
        int n = 12345;

        System.out.print("Reversed number is "+ reverse(n));

    }
    public static int reverse(int n){

        int reversed = 0;
        int remainder;

        while(n>0){
            remainder = n%10;
            reversed = (reversed*10) + remainder;
            n = n/10;
        }
        return reversed;
    }
}

