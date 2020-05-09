package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edieye on 2020-05-04.
 */
public class PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ret = new ArrayList<>();
        pathSum(root, sum, ret, new ArrayList<>());
        //return Math.abs
        return ret;
    }

    public void pathSum(TreeNode root, int sum, List<List<Integer>> ret, List<Integer> arr) {
        if (root == null) return;
        arr.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) ret.add(new ArrayList<>(arr));
        pathSum(root.left, sum - root.val, ret, arr);
        pathSum(root.right, sum - root.val, ret, arr);
        arr.remove(arr.size() - 1);
    }
}
