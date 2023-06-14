package week04;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(RemoveDuplicates.unique("aaassssvvvvvvvvtttftttt"));
    }
    public static String unique(String str){
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if (!(unique.contains(String.valueOf(str.charAt(i))))) {
                unique += "" + str.charAt(i);
            }
        }
        return unique;
    }
}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
 */
