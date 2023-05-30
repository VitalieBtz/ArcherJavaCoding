package week02;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {

        System.out.println("Numbers divisible by 15:");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                System.out.print(i + ", ");
            }
        }


        System.out.println("\nNumbers divisible by 3:");
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 15 != 0){
                System.out.print(i + ", ");
            }
        }


        System.out.println("\nNumbers divisible by 5:");
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0 && i % 15 != 0){
                System.out.print(i + ", ");
            }
        }











    }
}
