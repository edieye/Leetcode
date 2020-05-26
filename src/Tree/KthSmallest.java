package Tree;

import java.util.Stack;
/**
 * Created by edieye on 2020-05-25.
 */
/**230. Kth Smallest Element in a BST **/

public class KthSmallest {
    public int kthSmallest(TreeNode root, int k) {
        TreeNode curr = root;
        Stack<TreeNode> s = new Stack<>();
        while (!s.isEmpty() || curr != null) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            k--;
            if (k == 0) return curr.val;
            curr = curr.right;
        }
        return 0;
    }
}
