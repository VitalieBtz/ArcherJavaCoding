package week02;

public class SwapTwoVariables {
    public static void main(String[] args) {
        int x = 80;
        int y = 45;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
