package Greedy;

/**
 * Created by edieye on 2020-04-15.
 */


import java.util.HashMap;
import java.util.Map;

/** 860. Lemonade Change **/

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        if (bills == null || bills.length == 0) {
            return true;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(5,0);
        map.put(10,0);
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                map.put(5, map.get(5) + 1);
            }
            else if (bills[i] == 10) {
                if (map.get(5)  < 1) {
                    return false;
                }
                else {
                    map.put(10, map.get(10) + 1);
                    map.put(5, map.get(5) -1);
                }
            }
            else {
                if (map.get(10) >= 1 && map.get(5) >= 1) {
                    map.put(10, map.get(10) - 1);
                    map.put(5, map.get(5) - 1);
                }
                else if (map.get(5) >= 3) {
                    map.put(5, map.get(5) - 3);
                }
                else {
                    return false;
                }
            }

        }
        return true;
    }

    public boolean lemonadeChange1(int[] bills) {
        int fives = 0;
        int tens = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) fives++;
            else if (bills[i] == 10) {
                fives--;
                tens++;
            }
            else if (tens > 0) {
                tens--;
                fives--;
            }
            else {
                fives -=3;
            }
            if (fives < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LemonadeChange obj = new LemonadeChange();
        int[] test = {5,5,5,10,20};
        int[] test1 = {10,10};
        int[] test2 = {5,5,10};
        int[] test3 = {5,5,10,10,20};
        System.out.println(String.format("The test {5,5,5,10,20} output is %s", obj.lemonadeChange1(test))); // true
        System.out.println(String.format("The test {10,10} output is %s", obj.lemonadeChange1(test1))); // false
        System.out.println(String.format("The test {5,5,10} output is %s", obj.lemonadeChange1(test2))); //true
        System.out.println(String.format("The test {5,5,10,20} output is %s", obj.lemonadeChange1(test3))); //false




    }

}
