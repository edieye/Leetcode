package DynamicProgramming;

/**
 * Created by edieye on 2020-05-14.
 */

import java.util.List;

/** 120. Triangle **/
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int min = Integer.MAX_VALUE;
        List<Integer> prev = triangle.get(0);
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> curr = triangle.get(i);
            for (int j = 1; j < curr.size() - 1; j++) {
                curr.set(j, curr.get(j) + Math.min(prev.get(j-1), prev.get(j)));
            }
            curr.set(0, curr.get(0) + prev.get(0));
            curr.set(curr.size() - 1, curr.get(curr.size() -1) + prev.get(curr.size() - 1));
            prev = curr;
        }
        for (int i = 0; i < prev.size(); i++) {
            min = Math.min(prev.get(i), min);
        }
        return min;
    }

}
