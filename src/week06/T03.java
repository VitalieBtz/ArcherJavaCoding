package week06;

import java.util.Arrays;
import java.util.Collections;

public class T03 {

    public static  int  maxArrayOFint(int [] a){
Arrays.sort(a);
        return a[a.length-1];
    }

    public static void main(String[] args) {
        int []a={10,23,34};
        System.out.println("maxArrayOFint(a) = " + maxArrayOFint(a));
    }

}
