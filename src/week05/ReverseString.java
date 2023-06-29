package week05;

public class ReverseString {

    public static String reverseString(String str){

        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        /*
        //--------------Approach using StringBuilder------------------//

        StringBuilder sB = new StringBuilder();

        reversed = sB.append(str).reverse().toString();
         */

        return reversed;
    }
}
/*
String -- Reverse
 Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */
