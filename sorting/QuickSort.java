package sorting;

public class QuickSort {
    public static int[] sort(int[] arr, int s, int e){
        if(e - s + 1 <= 1){
            return arr;
        }

        int pivot = arr[e];
        int left = s;

        for(int i = s; i < e; i++){
            if(arr[i] < pivot){
                int tmp = arr[left];
                arr[left] = arr[i];
                arr[i] = tmp;
                left++;
            }
        }

        arr[e] = arr[left];
        arr[left] = pivot;

        sort(arr, s, left - 1);
        sort(arr, left + 1, e);

        return arr;
    }
}
