package String;

/**
 * Created by edieye on 2019-10-27.
 */
public class ReverseStringIII {

    // first attempt (super slow, i think it could be because of the call s.split())
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String[] split = s.split(" ");
        String ret = " ";
        for (String str : split) {
            char[] charArray = str.toCharArray();
            for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
                char tmp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = tmp;
            }
            ret += new String(charArray);
            ret += " ";
        }
        return ret.trim();
    }

    //second attempt (no str.split());\

    public String reverseWord(String s) {
        if (s == null || s.length() == 0) return s;
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            if (ca[i] != ' ') {
                int j = i;
                while (j + 1 < ca.length && ca[j + 1] != ' ') {
                    j++;
                }
                reverse(ca, i, j);
                i = j;
            }
        }
        return new String(ca);
    }

    public void reverse(char[] arr, int i, int j){
        for (; i < j ; i++, j--) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }


    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        ReverseStringIII obj = new ReverseStringIII();
        System.out.println(obj.reverseWord(str));
    }
}
