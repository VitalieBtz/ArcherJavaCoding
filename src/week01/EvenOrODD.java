package week01;

public class OddOrEven {
    public static String oDDorEven(int a) {
        return a % 2 == 0 ? "is Even " : "is Odd";
    }

    //---------------------------------------------------------
    public static void oddOrEven(int n) {

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }


}
