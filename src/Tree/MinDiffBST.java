package Tree;
import java.util.Stack;

/**
 * Created by edieye on 2020-05-30.
 */
/** 783. Minimum Distance Between BST Nodes **/

public class MinDiffBST {
    public int minDiffInBST(TreeNode root) {
        int ret = Integer.MAX_VALUE;
        TreeNode curr = root;
        TreeNode prev = null;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || curr != null)  {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            if (prev != null) {
                ret = Math.min(ret, curr.val - prev.val);
            }
            prev = curr;
            curr = curr.right;
        }
        return ret;
    }

}
