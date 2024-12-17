package sorting;

import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] arr, int s, int e){
        if(e - s + 1 <= 1){
            return arr;
        }

        int m = (s + e) / 2;
        sort(arr, s, m);
        sort(arr, m + 1, e);
        merge(arr, s, m, e);

        return arr;
    }

    public static void merge(int[] arr, int l, int m, int r){
        int length1 = m - l + 1;
        int length2 = r - m;

        int[] L = new int[length1];
        int[] R = new int[length2];

        for(int i = 0; i < length1; i++){
            L[i] = arr[l + i];
        }

        for(int i = 0; i < length2; i++){
            R[i] = arr[m + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i < length1 && j < length2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < length1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < length2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
