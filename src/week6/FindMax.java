package week6;

import java.util.Arrays;

public class FindMax {

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(Arrays.stream(arr).max());

        System.out.println("=====================================");
        
        int max = arr[0];// assume that first element is the maximum number

        for (int i = 0; i < arr.length; i++) {
            
            if(max < arr[i]){
                max = arr[i];
            }
            
        }
        System.out.println("max = " + max);


    }



}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */