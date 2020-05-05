package Tree;

/**
 * Created by edieye on 2020-05-03.
 */
public class IsValidBST {

    boolean isValidBST(TreeNode root) {
        return isValidBST(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    boolean isValidBST(TreeNode root, double min, double max) {
        if (root == null) return true;
        return root.val > min && root.val < max &&
                isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
}
