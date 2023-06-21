package week05;

public class ReverseTheString {
    public static void main(String[] args) {

    String str = "ABCD";


    String reverse = "";

    for(int i = str.length() - 1 ; i >= 0; i-- ){
        reverse += str.charAt(i);  // to get each character of the string starting from last index to index zero
    }


    System.out.println(reverse);





}
}
