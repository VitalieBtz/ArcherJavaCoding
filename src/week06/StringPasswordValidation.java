package week06;

public class StringPasswordValidation {
    public static boolean stringPasswordValidation(String password){

        boolean isValid = true;

        int upperCaseLetter = 0;
        int lowerCaseLetter = 0;
        int specialCharacter = 0;
        int digit = 0;
        int space = 0;

        for (int i = 0; i < password.length(); i++){

            char each = password.charAt(i);

            if (each >= '0' && each <= '9'){
                digit++;
            } else if (each == 32) {
                space++;
            } else if (each >= 'a' && each <= 'z') {
                lowerCaseLetter++;
            } else if (each >='A' && each <='Z') {
                upperCaseLetter++;
            } else {
                specialCharacter++;
            }
        }

        if (password.length() < 6 || space > 0 || upperCaseLetter < 1 || lowerCaseLetter < 1 || digit < 1  || specialCharacter < 1){

            isValid = false;
        }
        return isValid;
    }
}

