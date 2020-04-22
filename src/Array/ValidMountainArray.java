package Array;

/**
 * Created by edieye on 2020-04-21.
 */
public class ValidMountainArray {

    public boolean validMountainArray(int[] A) {
        int i = 0;
        boolean isDecreasing = false;
        int increasingCount = 0;
        int decreasingCount = 0;
        for (i = 0; i < A.length -1; i++) {
            if (A[i] >= A[i+1]) {
                isDecreasing = true;
            }
            if (!isDecreasing) {
                if (A[i] >= A[i+1]) return false;
                else increasingCount++;
            }
            if (isDecreasing) {
                if (A[i] <= A[i + 1]) return false;
                else decreasingCount++;
            }
        }
        return isDecreasing && i == A.length -1 && increasingCount > 0 && decreasingCount > 0;
    }

    public boolean validMountainArray1(int[] A) {
        int start = 0;
        int end = A.length - 1;
        if (A.length < 3) return false;
        while (start < end) {
            if (A[start+1] > A[start]) start++;
            else if (A[end] < A[end-1]) end--;
            else break;
        }
        return start == end && start != 0  && end != A.length-1;
    }

    public static void main(String[] args) {
        ValidMountainArray obj = new ValidMountainArray();
        int[] test = {2,1};
        int[] test1 = {3,5,5};
        int[] test2 = {0,3,2,1};
        int[] test3 = {0,2,3,4,5,2,1,0};
        int[] test4 = {0,2,3,3,5,2,1,0};
        System.out.println(obj.validMountainArray(test)); //false
        System.out.println(obj.validMountainArray(test1)); //false
        System.out.println(obj.validMountainArray(test2)); //true
        System.out.println(obj.validMountainArray(test3)); //true
        System.out.println(obj.validMountainArray(test4)); //false




        //System.out.println(valid);
    }

}
