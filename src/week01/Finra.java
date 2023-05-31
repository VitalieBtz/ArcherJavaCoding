package week01;

public class FINRA {
    public static void main(String[] args) {

        Finra(15);


    }


        public static void Finra(int number){

            boolean isValidNumber = number % 3 == 0 || number % 5 == 0 || number % 15 == 0;

            if (isValidNumber){
                if (number % 15 == 0){
                    System.out.println("FINRA");
                }else if (number % 3 == 0){
                    System.out.println("FIN");
                }else {
                    System.out.println("RA");
                }

            }else{
                System.out.println(number);
            }

        }
}
/*3️⃣  Numbers -- FINRA
Write a method that prints out the numbers from 1 to 30 but;
for numbers which are multiple of 3 print "FIN" instead of the number,
for numbers which are multiple of 5, print "RA" instead of the number,
and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.

 */