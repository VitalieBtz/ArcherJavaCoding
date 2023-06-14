package week04;

public class RemoveDuplicates {

    public static String removeDuplicates(String string){

        String result = "";

        for (int i = 0; i < string.length(); i++) {

            if (!result.contains(""+string.charAt(i))){
                result += string.charAt(i);
            }
        }

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
