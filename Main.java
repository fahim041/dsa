import sorting.InsertionSort;
import sorting.MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] arr = {6,2,6,78,1,8,3,4,33};
        System.out.println(Arrays.toString(MergeSort.sort(arr, 0, arr.length - 1)));
    }
}
