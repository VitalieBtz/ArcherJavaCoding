package week4;

import java.util.Arrays;

public class SameLetter {


    public static boolean Same_characters(String str1, String str2){

        char[] first = str1.toCharArray();
        char[] second = str2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }
}

/*
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */