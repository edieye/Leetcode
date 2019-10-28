/**
 * Created by edieye on 2019-10-27.
 */
public class FindMin {
    public int findMin(int[] arr) {
        int start = 0; int end = arr.length -1;
        while (start < end){
            int middle = start + (end -start)/2;
            if (middle > 0 && arr[middle-1] > arr[middle])
                return arr[middle];
            if (arr[middle] < arr[end]) {
                end = middle;
            }
            else {
                start = middle + 1;
            }
        }
        return arr[start];
    }
}
