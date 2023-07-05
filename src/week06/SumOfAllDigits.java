package week06;

public class SumOfAllDigits {
    public static int sumOfAllDigits(String str) {

        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (each >= '0' && each <= '9') {
                num += each;

                if (each == str.length() - 1 || !(str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9')) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        return sum;
    }
}
