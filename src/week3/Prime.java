package week3;

public class Prime {

    public static void main(String[] args) {

        System.out.println(isPrime(3));
        System.out.println(isPrime(6));




    }

    //A prime is a natural number greater than 1 that only evenly divisible by 1 and itself.
    // For example 2, 3, 5, 7, 11,... are prime numbers.
    //For example 4, 6, 8, 9, 10, ... are NOT prime numbers.
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        //check numbers from 2 to (number-1)
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }
}
//Write a method that can check if a number is prime or not.