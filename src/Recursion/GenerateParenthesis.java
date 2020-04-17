package Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edieye on 2019-10-31.
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        generateParenthesis(n, 0, new String(), ret, n);
        return ret;
    }

    public List<String> generateParenthesis1(int n) {
        List<String> ret = new ArrayList<>();
        generateParenthesis1(n, n, new String(), ret, n);
        return ret;
    }

    public void generateParenthesis1(int left, int right, String str, List<String> ret, int max)  {
        if (max * 2 == str.length()) {
            ret.add(str);
            return;
        }
        if (left < max) {
            generateParenthesis1(left + 1, right, str + "(", ret, max);
        }
        if (right < left) {
            generateParenthesis1(left, right +1, str + ")", ret, max);
        }
    }



    public void generateParenthesis(int left, int right, String str, List<String> ret, int max) {
        //if (left > right) return;
        if (str.length() == max * 2) {
            ret.add(str);
            return;
        }
        if (left > 0) {
            generateParenthesis(left - 1, right +1, str += "(", ret, max);
            //builder.deleteCharAt(builder.length()-1);
        }
        if (right > 0) {
            generateParenthesis(left, right -1, str += ")", ret, max);
            //builder.deleteCharAt(builder.length()-1);
        }
    }

    //public void generateParenthesis(int )

    public static void main(String[] args) {
        GenerateParenthesis obj = new GenerateParenthesis();
        System.out.println(obj.generateParenthesis(3));
    }
}
