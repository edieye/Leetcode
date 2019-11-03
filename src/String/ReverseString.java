package String;

import java.util.Arrays;

/**
 * Created by edieye on 2019-10-29.
 */
public class ReverseString {

    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return "";
        String[] arr = s.split("\\s+");
        int i = 0, j = arr.length -1;
        while (i < j){
            String tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        StringBuilder builder = new StringBuilder();
        for (String str: arr){
            builder.append(str);
            builder.append(" ");
        }
        return builder.toString().trim();

    }

    public static void main(String[] args) {
        String input = "the sky is blue";
        String input2 = "  hello world!  ";
        String input3 = "a good   example";
        ReverseString obj = new ReverseString();
        System.out.println(obj.reverseWords(input));
        System.out.println(obj.reverseWords(input2));
        System.out.println(obj.reverseWords(input3));
    }
}

