package week4;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCCDD"));
    }



    public static String removeDuplicates(String str){

        String result = ""; //because string is immutable we cannot remove the string, we need new string object

        for (int i = 0; i < str.length(); i++) { //  add each character from str to result one by one with iterating.
            if (result.contains(""+ str.charAt(i))) { //  concatenating empty string because contains method wants String, charAt method wants Char.
                continue; // if the character is already contained in new string, skip it
            }

            result = result + str.charAt(i);// otherwise we will continue to add
        }

      return result;


    }

}

/*
➡️ String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC



 */