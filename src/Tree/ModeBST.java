package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edieye on 2020-05-03.
 */
public class ModeBST {

    public int[] findMode(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        inOrderTraverse(root, null, 0, 1, ret);
        return ret.stream().mapToInt(i -> i).toArray();
    }

    public void inOrderTraverse(TreeNode root, Integer prev, int max, int count, List<Integer> ret) {
        if (root == null) return;
        inOrderTraverse(root.left, prev, max, count, ret);
        if (prev != null) {
            count = (root.val == prev) ? count + 1 : 1;
            if (count == max) {
                ret.add(root.val);
            } else if (count > max) {
                ret.clear();
                ret.add(root.val);
                max = count;
            }
        }

        prev = root.val;

        inOrderTraverse(root.right, prev, max, count, ret);

    }
}
