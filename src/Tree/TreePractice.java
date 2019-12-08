package Tree;

import apple.laf.JRSUIUtils;

import java.util.ArrayList;

/**
 * Created by edieye on 2019-11-03.
 */
public class TreePractice {

    // basic tree questions from : http://cslibrary.stanford.edu/110/BinaryTrees.html#java
    TreeNode root;

    void insertNode(int data){
        insertNode(root, data);
    }
    TreeNode insertNode(TreeNode root, int data) {
        TreeNode n = new TreeNode(data);
        if (root == null) {
            root = n;
            return root;
        }
        if (data > root.val) {
            root.left = insertNode(root.left, data);
        }
        else root.right = insertNode(root.right, data);
        return root;
    }

    int size(TreeNode root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
    }

    int minValue(TreeNode root) {
        TreeNode curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr.val;
    }

    void inOrderTraversal(TreeNode root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);
    }

    boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return sum == 0;
        }
        int subSum = sum - root.val;
        return hasPathSum(root.left, subSum) || hasPathSum(root.right, subSum);
    }

    void printPaths(TreeNode root) {
        printPaths(root, new ArrayList<Integer>());
    }

    void printPaths(TreeNode root, ArrayList<Integer> ret) {
        if (root == null)return;
        if (root.left == null && root.right == null) {
            for (int i = 0 ; i < ret.size(); i++) {
                System.out.println(ret.get(i));
            }
        }
        ret.add(root.val);
        printPaths(root.left, ret);
        printPaths(root.right, ret);
    }

    void mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        mirror(root.left);
        mirror(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    void doubleTree(TreeNode root) {
        if (root == null) return;
        doubleTree(root.left);
        doubleTree(root.right);
        TreeNode temp = new TreeNode(root.val);
       // root.left =



    }


}
