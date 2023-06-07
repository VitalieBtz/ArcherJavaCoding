package week03;

public class PrimeNumbers {

    public static boolean IsPrime(int x){
        if (x <= 1)
            return false;


        for (int i = 2; i < x; i++)
            if (x % i == 0)
                return false;

        return true;
    }


    public static void main(String[] args) {

        System.out.println(IsPrime(43));
    }








}

