package week04;

public class FrequencyOfCharacters {

    public static String frequencyOfCharacters(String string){

        String result = "";

        for (int i = 0; i < string.length(); i++) {

            char ch = string.charAt(i);
            int count = 0;

            for (int j = 0; j < string.length(); j++) {

                if (string.charAt(j) == ch){
                    count++;
                }
            }
            if (result.contains(""+ch)){
                continue;
            }
            result +="" +  ch + count;
        }

        return  result;

    }
}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
