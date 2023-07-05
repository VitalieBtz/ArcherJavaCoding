package week06;

public class t01 {
    static int findSum(String str){
        int s =0;
        String l="0";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                l+=str.charAt(i);
            }
            else {
                s+=Integer.parseInt(l);
                l="0";
            }
        }
        return s+Integer.parseInt(l);
    }

    public static void main(String[] args) {

        System.out.println(findSum("12Ab3n"));
    }
}
