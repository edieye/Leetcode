package Search;

/**
 * Created by edieye on 2019-10-26.
 */
public class SearchRotatedArray {

    public int minIndex(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int middle = start + (end - start) /2;
            if (middle == 0 || arr[middle -1] > arr[middle]) {
                return middle;
            }
            else if (arr[middle] > arr[end]) {
                start = middle+1;
            }
            else {
                end = middle;
            }
        }
        return start;
    }


    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int minIndex = minIndex(nums);
        System.out.println("The min index is: "  + minIndex);
        if (target == nums[minIndex]) return minIndex;
        int start = 0; int end = nums.length -1;
        if (target > nums[end]) end = minIndex;
        if (target <= nums[end]) start = minIndex;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target == nums[mid]) {
                return mid;
            }
            else if (target < nums[mid]){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2}; //[4,5,6,7,0,1,2]
        int[] nums1 = {1,3};

        SearchRotatedArray obj = new SearchRotatedArray();
        System.out.println(obj.search(nums, 4));
        System.out.println(obj.search(nums1, 3));

    }

}
