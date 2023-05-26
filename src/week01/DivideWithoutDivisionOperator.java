package week01;

public class DivideWithoutDivisionOperator {

    public static void main(String[] args) {

        divide(10,5);






    }
    public static void divide(int n, int d){ // n= numerator d= divisor --> n/d
        int result = 0;
        if (n == 0){
            System.err.println("you cannot divide by 0");
            System.exit(1);

        }else if (n == 0){
            System.out.println(0);

        }else if (n == d){
            System.out.println(1);

        }else if (n>0 && d>0 && n < d ){
            System.out.println(0);

        }else if (n >0 && d>0){ // both of them are positive
            int count = 0;
            while(n>d){
                n-= d;
                count++;
            }

        }else{

        }
    }







}
/*
2️⃣  Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.

 */