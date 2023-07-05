package week04;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {

        String s1 = "zasdfrzefebd";
        String s2 = "abddffreeszz";


        if (s1.length() != s2.length()){
            System.out.println("Length does not match");
            System.exit(1);
        }

       char[] arrayS1 = s1.toCharArray();
       char[] arrayS2 = s2.toCharArray();

        Arrays.sort(arrayS1);
        Arrays.sort(arrayS2);

        if (Arrays.equals(arrayS1,arrayS2)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }





    }
}






