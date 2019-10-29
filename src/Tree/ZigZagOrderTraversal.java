package Tree;

import Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by edieye on 2019-10-28.
 */
public class ZigZagOrderTraversal {


    // done using 2 queues
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        ArrayDeque<TreeNode> q1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> q2 = new ArrayDeque<>();
        q1.add(root);
        List<Integer> arr = new ArrayList<>();
        while (!q1.isEmpty() || !q2.isEmpty()){
            while (!q1.isEmpty()){
                TreeNode n = q1.poll();   //3
                arr.add(n.val);           //queue: 9 -> 20
                if (n.left != null) q2.add(n.left);
                if (n.right != null) q2.add(n.right);
                if (q1.isEmpty()) {
                    ret.add(arr);
                    arr = new ArrayList<>();
                }
            }
            while (!q2.isEmpty()) {
                TreeNode n = q2.poll();  //20, 9
                arr.add(0, n.val);
                if (n.left != null) q1.add(n.left);
                if (n.right != null) q1.add(n.right);
                if (q2.isEmpty()) {
                    ret.add(arr);
                    arr = new ArrayList<>();
                }
            }
        }
        return ret;
    }

    // done again using one queue because using two queues has too much code redundancy
    public List<List<Integer>> zigzagLevelOrderI(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        boolean zigZag = false;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        if (root == null) return ret;
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < queue.size(); i++) {
                TreeNode n = queue.poll();
                if (zigZag) arr.add(0, n.val);
                else arr.add(n.val);
                if (n.left != null) queue.add(n.left);
                if (n.right != null) queue.add(n.right);
            }
            ret.add(arr);
            zigZag = !zigZag;
        }
        return ret;

    }
}
