package Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edieye on 2019-10-31.
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        generateParenthesis(n, n, new StringBuilder(), ret);
        return ret;
    }


    public void generateParenthesis(int left, int right, StringBuilder builder, List<String> ret) {
        if (left > right) return;
        if (left == 0 && right == 0) {
            ret.add(builder.toString());
        }
        if (left > 0) {
            generateParenthesis(left - 1, right, builder.append("("), ret);
            builder.deleteCharAt(builder.length()-1);
        }
        if (right > 0) {
            generateParenthesis(left, right -1, builder.append(")"), ret);
            builder.deleteCharAt(builder.length()-1);
        }
    }

    public static void main(String[] args) {
        GenerateParenthesis obj = new GenerateParenthesis();
        System.out.println(obj.generateParenthesis(3));
    }
}
