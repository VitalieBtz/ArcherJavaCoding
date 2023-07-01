package week6;

public class PasswordValidation {

       public static boolean passwordValidation(String pswd){

        boolean isValid = true;

        int upperCaseLet = 0;
        int lowerCaseLet = 0;
        int specialChar = 0;
        int digit = 0;


        for (int i = 0; i < pswd.length(); i++){

            char each = pswd.charAt(i);

            if (each >= '0' && each <= '9'){
                digit++;
            } else if (each >= 'a' && each <= 'z') {
                lowerCaseLet++;
            } else if (each >='A' && each <='Z') {
                upperCaseLet++;
            } else {
                specialChar++;
            }
        }

        if (pswd.length() < 6 || upperCaseLet < 1 || lowerCaseLet < 1 || digit < 1  || specialChar < 1){

            isValid = false;

        }
        return isValid;
    }
    public static void main(String[] args) {
        System.out.println(passwordValidation("asdaa1//dkAdk.!"));
    }
 }






/*
Write a return method that can verify if a password is valid or not.
requirements:
Password MUST be at least have 6 characters and should not contain space
PassWord should at least contain one upper-case letter
PassWord should at least contain one lowercase letter
Password should at least contain one special character
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */