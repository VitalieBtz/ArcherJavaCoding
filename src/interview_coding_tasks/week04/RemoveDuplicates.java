package interview_coding_tasks.week04;

public class RemoveDuplicates {
    public static void main(String[] args) {


        System.out.println(removeDuplicate("AAABBBCCC"));


    }


    public static String removeDuplicate(String str) {
        String result = "";


        for (int i = 0; i < str.length(); i++) {

            if (!result.contains(String.valueOf(str.charAt(i)))) {
                result += String.valueOf(str.charAt(i));
            }
        }
        return result;
    }




        }


