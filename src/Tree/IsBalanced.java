package Tree;

/**
 * Created by edieye on 2020-05-05.
 */

/**110. Balanced Binary Tree **/
public class IsBalanced {

    //top down approach
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (Math.abs(left - right) >= 2) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);


    }

    public int getDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }

    //bottom up approach
    public boolean isBalancedI(TreeNode root) {
        return !(helper(root) == -1);
    }

    public int helper(TreeNode root) {
        if (root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) >= 2) return -1;
        return 1 + Math.max(helper(root.left), helper(root.right));
    }
}
