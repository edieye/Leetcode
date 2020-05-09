package Tree;

import java.util.*;

/**
 * Created by edieye on 2020-05-06.
 */
public class AllNodesDistanceK {

    public void build(Map<TreeNode, TreeNode> map, TreeNode root) {
        if (root == null) return;
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
                TreeNode n = q.poll();
                if (n.left != null) {
                    q.add(n.left);
                    map.put(n.left, n);
                }
                if (n.right != null) {
                    q.add(n.right);
                    map.put(n.right, n);
                }
            }

    }

    public List<Integer> distance(TreeNode root, TreeNode target, int K) {
        Map<TreeNode, TreeNode> map = new HashMap<>();
        build(map, root);
        int currLevel = 0;
        Set<TreeNode>  set = new HashSet<>();
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(target);
        set.add(target);
        while (currLevel <= K) {

            int size = q.size();
            for (int i = 0; i < size ; i++) {
                TreeNode n = q.poll();
                if (n.left != null && !set.contains(n.left)) {
                    set.add(n.left);
                    q.add(n.left);
                }
                if (n.right != null && !set.contains(n.right)) {
                    set.add(n.right);
                    q.add(n.right);
                }
                if (map.containsKey(n) && !set.contains(n)) {
                    set.add(n);
                    q.add(map.get(n));
                }
                currLevel++;
            }
        }
        List<Integer> ret= new LinkedList<>();
        while(!q.isEmpty()) ret.add(q.poll().val);
        return ret;
    }
}
