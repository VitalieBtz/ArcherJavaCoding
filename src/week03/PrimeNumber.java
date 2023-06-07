package week03;

public class PrimeNumber {

    public static boolean isPrime(int n){

        for (int i = 2; i < n; i++) {

            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    /*
    What defines a prime number?
        A prime number is a whole number greater than 1 and is divisible only by 1 and the number itself.
        For example, 3 is divisible only by 1 and 3
     */
}
/*
Numbers -- Prime Number
Write a method that can check if a number is prime or not.
 */
