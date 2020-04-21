package Pointers;

import com.sun.tools.javac.comp.Check;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by edieye on 2020-04-20.
 */

/*567. Permutation in String */
public class CheckInclusion {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            updateMap(map, s1.charAt(i), 1);
            updateMap(map, s2.charAt(i), -1);
        }
        if (map.isEmpty()) {
            return true;
        }
        for (int i = s1.length(); i < s2.length(); i++) {
            updateMap(map, s2.charAt(i), -1);
            updateMap(map, s2.charAt(i - s1.length()), 1);
            if (map.isEmpty()) return true;

        }
        return false;
    }

    public void updateMap(Map<Character, Integer> map, Character c, int num) {
        if (map.containsKey(c)) {
            int count = map.get(c);
            count += num;
            if (count == 0) {
                map.remove(c);
            }
            else {
                map.put(c, count);
            }
        }
        else {
            map.put(c, num);
        }
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bbbca";
        CheckInclusion obj = new CheckInclusion();
        System.out.println(obj.checkInclusion(s1, s2));
    }
}
