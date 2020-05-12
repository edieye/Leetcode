package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edieye on 2020-05-12.
 */
public class PascalsTriangle {

    //** 118. Pascal's Triangle **/

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> baseCase = new ArrayList<>();
        if (numRows == 0) {
            return ret;
        }
        baseCase.add(1);
        ret.add(baseCase);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = ret.get(i-1);
            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);

            for (int j = 1; j < prevRow.size(); j++) {
                currRow.add(prevRow.get(j) + prevRow.get(j-1));
            }
            currRow.add(1);
            ret.add(currRow);


        }
        return ret;
    }
}
