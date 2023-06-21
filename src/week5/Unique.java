package week5;

import java.util.LinkedHashSet;
import java.util.Set;

public class Unique {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (!unique.contains("" + each)) {
                unique += each;
            }

        }
        System.out.println(unique);


    }

}

/*
 Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */