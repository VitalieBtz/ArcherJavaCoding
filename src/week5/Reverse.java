package week5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Reverse {

    public static void main(String[] args) {

        String str = "ABCD";
        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += "" + str.charAt(i);
        }
        System.out.println(reverse);

        System.out.println("=====================" );

        StringBuilder rev2 = new StringBuilder();
        rev2.append(str);
        System.out.println("=====================" );
        System.out.println(rev2.reverse() );

        System.out.println("=====================" );
        StringBuffer rev3 = new StringBuffer();
        rev3.append(str);
        System.out.println(rev3.reverse());
    }



}


/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */