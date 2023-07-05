package week06;

public class T02 {

    public static boolean PasswordPass(String A){
        int sCHAR=0;
        int lowercase=0;
        int uppercase=0;
        int digits=0;
        for (int i = 0; i < A.length(); i++) {
            int k=0;
            char s=A.charAt(i);
            if(A.length()>=6) {
                if (Character.isDigit(s)) {
                    digits++;
                }
                if (!Character.isLetterOrDigit(s)) {
                    sCHAR++;
                }
                if (Character.isUpperCase(s)) {
                    uppercase++;
                }
                if (Character.isLowerCase(s)) {
                    lowercase++;
                }
            }
            if(lowercase>0&&uppercase>0&&sCHAR>0&&digits>0){
                return true;
            }
        }
return false;
    }

    public static void main(String[] args) {

        System.out.println("PasswordPass(\"bouzn\") = " + PasswordPass("B8f0@h"));

    }
}
