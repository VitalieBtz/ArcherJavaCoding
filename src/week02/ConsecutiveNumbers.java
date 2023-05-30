package week02;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            String output = "";

            if (i % 2 == 0) {
                output += "Codility";
            }
            if (i % 3 == 0) {
                output += "Test";
            }
            if (i % 5 == 0) {
                output += "Coders";
            }

            if (output.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(output);
            }


        }
    }




}
