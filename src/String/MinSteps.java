package String;

/**
 * Created by edieye on 2020-05-02.
 */

import java.util.HashMap;
import java.util.Map;

/** 1347. Minimum Number of Steps to Make Two Strings Anagram **/

 public class MinSteps {
     public int minSteps(String s, String t) {
         int ret = 0;
         Map<Character, Integer> sMap = new HashMap<>();
         for (int i = 0; i < s.length(); i++) {
             putInMap(s.charAt(i), sMap);
         }
         for (int i = 0; i < t.length(); i++) {
             if (sMap.containsKey(t.charAt(i))) {
                 sMap.put(t.charAt(i), sMap.get(t.charAt(i)) -1);
                 if (sMap.get(t.charAt(i)) == 0) {
                     sMap.remove(t.charAt(i));
                 }
             }
             else {
                 ret++;
             }
         }

         return ret;
     }

     public void putInMap(Character c, Map<Character, Integer> map) {
         if (map.containsKey(c)) {
             map.put(c, map.get(c) + 1);
         }
         else {
             map.put(c, 1);
         }
     }


     public static void main(String[] args) {
         String t = "bab";
         String s = "aba";
         String t1 =  "leetcode";
         String s1 = "practice";
         MinSteps obj = new MinSteps();
         System.out.println(obj.minSteps(t, s)); // 1
         System.out.println(obj.minSteps(t1, s1));
     }

}
