package week07;

public class ArrayFindMinimum {

    /*
    Write a method that can find the minimum number from an int Array.
     */
    public static void main(String[] args) {
        int[]arr={2,5,4,3,6,-8};
        System.out.println("arrayFindMin(arr) = " + arrayFindMin(arr));
    }
    public static int arrayFindMin(int... arr) {
        int minNum = arr[0];
        for (int eachNum : arr) {
            if (eachNum < minNum) {
                minNum = eachNum;
            }
        }
        return minNum;
    }
}