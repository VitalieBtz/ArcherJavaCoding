package week05;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class UniqueCharacters {
    public static void main(String[] args) {

        System.out.println(UniqueCharacters.FindUniqueEX1("AAABBBCCCDEF"));

        }


    public static String FindUniqueEX1(String str){

        String UniqueCharacter = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                UniqueCharacter += ch;
            }

        }

        return UniqueCharacter;

    }


}
/*
String - Find the unique
 Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */
