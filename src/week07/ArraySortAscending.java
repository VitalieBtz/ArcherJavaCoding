package week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySortAscending {
    public static int[] sort(int []a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int aaa = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aaa;
                }
            }

        }

        return a;
    }
    public static void main(String[] args) {
        int []a={13,2,34,4,55};
        System.out.println(Arrays.toString(sort(a)));


    }

}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
