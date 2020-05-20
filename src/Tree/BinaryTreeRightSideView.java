package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edieye on 2020-05-19.
 */
/**199. Binary Tree Right Side View **/

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        rightSideView(root, ret, 0);
        return ret;
    }

    public void rightSideView(TreeNode root, List<Integer> ret, int curr) {
        if (root == null) return;
        if (ret.size() == curr) {
            ret.add(root.val);
        }
        rightSideView(root.right, ret, curr+1);
        rightSideView(root.left, ret, curr+1);
    }
}
