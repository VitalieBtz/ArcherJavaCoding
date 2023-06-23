package week05;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindTheUnique {

    public static void main(String[] args) {
        System.out.println(uniqueCharacter("aabbcddf"));
        System.out.println(uniqueCharacter("aabbbbcddddkl"));
    }

    public static String uniqueCharacter(String str){
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(str.indexOf(each)==str.lastIndexOf(each)){
                unique+=each;
            }
        }
        return unique;
    }

/*
    public static Map uniqueCharacter(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if (frequency == 1) {
                map.put(each.charAt(0), frequency);
            }
        }
        return map;
    }

 */
    
}

//
//        ➡️ String - Find the unique
//        Write a return method that can find the unique characters from the String
//        Ex: unique("AAABBBCCCDEF") ==> "DEF";