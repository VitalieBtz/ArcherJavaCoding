package week08;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        int [] array = {1,0,20,0,30,0,4};
        System.out.println(Arrays.toString(zeroToEnd(array)));
    }

    public static int [] zeroToEnd(int [] array){

        for (int i = 0; i < array.length; i++) { //{1,0,20,0,30,0,4}
            for (int j = i+1; j < array.length; j++) {
                if (array [i] == 0){
                    array [i] = array[j];
                    array[j] = 0;
                }

            }

        }
        return array;
    }


}
/*
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
