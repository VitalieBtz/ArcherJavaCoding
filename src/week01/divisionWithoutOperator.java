package week01;

public class divisionWithoutOperator {
    public static void main(String[] args) {
        Divide(21, 4);

    }
    public static void Divide(int number1, int number2){

        int count = 0;

        while (number1 >= number2) {
            number1 -= number2;
            count++;
        }

        System.out.println(count+" with a remainder of "+number1);


    }


}

        


/*Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.

 */
