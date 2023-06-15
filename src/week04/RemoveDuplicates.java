package week04;

public class RemoveDuplicates {

    public static String removeDuplicates(String string){

        String result = ""; //because string is immutable we cannot remove the string, we need new string object

        for (int i = 0; i < string.length(); i++) { //  add each character from str to result one by one with iterating.

            if (result.contains("" + string.charAt(i))) { //  concatenating empty string because contains method wants String, charAt method wants Char.
                continue; // if the character is already contained in new string, skip it
            }

            result = result + string.charAt(i);// otherwise we will continue to add
        }
        /*---------------------------------------------
        for (int i = 0; i < string.length(); i++) {

            if (!result.contains(""+string.charAt(i))){
                result += string.charAt(i);
            }
        }
         -----------------------------------------------*/

        /* ----------- Second Approach --------------------

        result = new LinkedHashSet<>(Arrays.asList(string.split(""))).toString();
        result = result.replace(", ", "").replace("[", "").replace("]", "");
        */

        return result;
    }
}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
 */
