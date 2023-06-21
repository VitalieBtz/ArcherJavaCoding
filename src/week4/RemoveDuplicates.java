package week4;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String removeDup = "AAABBBCCC";
        String result = "";

        for (int i = 0; i < removeDup.length(); i++) {

            char each = removeDup.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }

        }
        System.out.println(result);
        System.out.println(removeDUplicate("AAABBBCCCDDDDFFFF"));
        System.out.println("_________________________________________________");
    }



        public static String removeDUplicate(String A){
            LinkedHashSet<String> AA= new LinkedHashSet<>(Arrays .asList( A.split("")));
            String AB="";
            for (String s : AA) {
                AB+=s;
            }
            return AB;

        }



}
/*
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
 */