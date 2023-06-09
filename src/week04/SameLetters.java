package week04;

import java.util.Arrays;

public class SameLetters {

    public static boolean Same_characters(String str1, String str2){

        char[] first = str1.toCharArray();
        char[] second = str2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

    //---------------- Same Approach, but longer code ----------------------------------
    public static boolean sameLetters(String a, String b){

        a = a.replaceAll(" ", "");
        b = b.replaceAll(" ", "");

        if (a.length() != b.length()){
            return false;
        }

        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        String aSorted = "";
        String bSorted = "";

        for(int i = 0; i < arrayA.length-1; i++){

            aSorted += arrayA[i];
            bSorted += arrayB[i];
        }
        return aSorted.equals(bSorted);
    }
}
/*
String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */
