package week05;

public class UniqueCharacters {
    public static String uniqueCharacters(String str){

        String uniqueCharacters = "";

        for (int i = 0; i < str.length(); i++){

            char eachCharacter = str.charAt(i);

            if (str.indexOf(eachCharacter) == str.lastIndexOf(eachCharacter)){
                uniqueCharacters += eachCharacter;
            }
        }
        return uniqueCharacters;
    }
}
