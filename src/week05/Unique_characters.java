package week05;

public class Unique_characters {
    public static void main(String[] args) {


        String str =("AAABBBCCCDEF");

        String unique="";

        for (int j = 0; j < str.length(); j++) {


            char character=str.charAt(j);
            int frequency=0;
            for (int i = 0; i < str.length(); i++) {// we create for loop to checks how many times the character has appeared in the str
                if(str.charAt(i)==character){//if the character has appeared in the string
                    frequency++;// increase the frequency by 1
                }
            }

            if(frequency==1){// if the frequency of character equals to 1, then it is unique
                unique+=character;
            }
        }

        System.out.println(unique);
    }
}

