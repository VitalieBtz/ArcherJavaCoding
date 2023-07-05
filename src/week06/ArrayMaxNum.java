package week06;

public class ArrayMaxNum {
    public static int arrayFindMaximum(int[] arr){

        int maxNumber = arr[0];

        for (int eachNumber : arr) {

            if (eachNumber > maxNumber){
                maxNumber = eachNumber;
            }
        }

        return maxNumber;
    }
}
