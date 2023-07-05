package week07;

public class ArrayFindMinimum {

    public static void main(String[] args) {

        int[] array = {12,4,8,3,9};
        System.out.println(MinNumber(array));
    }

    public static int MinNumber(int[] arr1) {

        int min = arr1[0];

        for (int i = 0; i < arr1.length; i++) {

            if (min > arr1[i]) {
                min = arr1[i];
            }
        }

        return min;
    }

    }
/*
Write a method that can find the minimum number from an int Array.
 */
