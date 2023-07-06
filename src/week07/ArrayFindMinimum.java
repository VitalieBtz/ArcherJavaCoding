package week07;

public class ArrayFindMinimum {
public static int mini(int [] a){
    int l=a[0];
    for (int i : a) {

        if(l>=i){
            l=i;
        }
    }
 return l;
}

    public static void main(String[] args) {
    int [ ]a={123,3,4,55,555,666};
        System.out.println(mini(a));


    }
}
/*
Write a method that can find the minimum number from an int Array.
 */
