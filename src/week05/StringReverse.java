package week05;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(uniqueCharacter("vita"));
        System.out.println(uniqueCharacter("voloshchuk"));
    }

    public static String uniqueCharacter(String str) {
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

//        String -- Reverse
//        Write a function that can reverse a String
//        Ex: Reverse("ABCD"); ==> DCBA

}