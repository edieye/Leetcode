package Sort;

/**
 * Created by edieye on 2020-02-13.
 */
public class MergeSort {


    public void mergeSort(int[] arr) {
        mergeSort(arr, arr.length);
    }

    public void mergeSort(int[] arr, int n) {
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[j];
        }
        mergeSort(left, mid);
        mergeSort(right, n-mid);
        merge(arr, left, right, mid, n-mid);
    }

    public void merge(int[] arr, int[] left, int[] right, int leftSize, int rightSize) {
        int i = 0; int j = 0 ; int k = 0;
        while (i < leftSize && j < rightSize) {
            if (arr[i] < arr[j]) {
                arr[k++] = arr[i++];
            }
            else {
                arr[k++] = arr[j++];
            }
        }

        while (i < leftSize) {
            arr[k++] = arr[i++];
        }
        while (j < rightSize) {
            arr[k++]  = arr[j++];
        }
    }


    public static void main (String[] args) {


    }
}
