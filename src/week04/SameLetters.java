package week04;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println("sameLetters(\"abc\",\"cde\") = " + sameLetters("abc", "cde"));
        System.out.println("sameLetters(\"abc\",\"acb\") = " + sameLetters("abc", "acb"));
    }

    public static boolean sameLetters(String str1, String str2) {
        if (str1 == null) {
            return str2 == null;
        } else if (str2 == null) {
            return false;

        }
        char[] left = str1.toCharArray();
        char[] right = str2.toCharArray();
        Arrays.sort(left);
        Arrays.sort(right);
        return Arrays.equals(left, right);
    }
}
/*
String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */
