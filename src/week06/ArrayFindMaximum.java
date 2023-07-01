package week06;

public class ArrayFindMaximum {

    public static int arrayFindMaximum(int[] arr){

        int maxNumber = arr[0];

        for (int eachNumber : arr) {

            if (eachNumber > maxNumber){
                maxNumber = eachNumber;
            }
        }

        //-----------Second Approach-----------------//
        /*
        Arrays.sort(arr); //--> using Arrays class method sort --> will sort array's elements in ascending order
        maxNumber = arr[arr.length-1]; // --> maximum number will be the element at the last index of the array [arr.length-1]
         */

        return maxNumber;
    }
}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
