package week02;

public class printConsecutiveNumbers {

    public static void consecutiveNumbers(int num){
        for(int i = 1;  i <= num; i ++){
          
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0){
                System.out.print("CodilityTestCoders ");
            } else if (i % 2 == 0 && i % 3 == 0 || i % 2 == 0 && i % 5 == 0 || i % 3 == 0 && i % 5 == 0 ) {
                System.out.print("CodilityTest ");
            } else if (i % 3 == 0 || i % 2 == 0 || i % 5== 0) {
                System.out.print("Codility ");
            }else {
                System.out.print(i + " ");
            }
        }
     }
      /*
    public static void printConsecutiveNumbers(int n){

        for (int i = 1; i <=n; i++) {

            String result = "";

            if (i % 2 == 0){
                result = "Codility";
            }
            if (i % 3 == 0){
                result += "Test";
            }
            if (i % 5 == 0){
                result += "Coders";
            }

            if (result.isEmpty()){
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }
    */
}
/*
 Numbers – Print Consecutive Numbers
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
EX:
Numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers, 2,3 and 5, should be replaced by CodilityTestCoders.
 */
