package BinarySearch;

/**
 * Created by edieye on 2020-05-11.
 */
public class IsBadVersion {

    /** 278. First Bad Version **/
    public int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;
        int res = -1;
        while (lo <= hi) {
            int middle = lo + (hi - lo) / 2;
            if (isBadVersion(middle)) {
                hi = middle -1;
                res = middle;
            }
            else {
                lo = middle + 1;
            }
        }
        return res;
    }

    // pre-defined in leetcode
    public boolean isBadVersion(int n) {
        return true;
    }
}
