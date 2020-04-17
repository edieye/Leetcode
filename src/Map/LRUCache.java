package Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by edieye on 2019-10-29.
 */


public class LRUCache {

    int capacity;
    int currSize;
    Map<Integer, ListNode> map;
    ListNode head;
    ListNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        currSize = 0;
        map = new HashMap<>();

        head = new ListNode();
        tail = new ListNode();

        head.next = tail;
        tail.prev = head;

    }

    public int get(int key) {
        if (map.containsKey(key)) {
            ListNode n = map.get(key);
            int ret = n.val;
            moveToFront(n);
            return ret;
        }
        return -1;

    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            ListNode n = map.get(key);
            n.val = value;
            moveToFront(n);
            return;
        }

        ListNode n = new ListNode();
        n.key = key;
        n.val = value;

        map.put(key, n);
        addToFront(n);
        currSize++;
        if (currSize > capacity) {
            removeEnd();
       }

    }

    public void moveToFront(ListNode n) {
        ListNode prev = n.prev;
        ListNode next = n.next;
        prev.next = next;
        next.prev = prev;
        addToFront(n);
    }

    public void addToFront(ListNode n) {
        ListNode next = head.next;
        head.next =n;
        n.prev = head;
        n.next = next;
        next.prev = n;
    }

    public void removeEnd(){
        if (currSize > 1) {
            ListNode prev = tail.prev.prev;
            map.remove(tail.prev.key);
            prev.next = tail;
            tail.prev = prev;
        }
    }

    private class ListNode {
        ListNode prev;
        ListNode next;
        int key;
        int val;
    }


    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2 /* capacity */ );


        //test one:
//        cache.put(1, 1);
//        cache.put(2, 2);
//        System.out.println(cache.get(1));    // returns 1
//        cache.put(3, 3);    // evicts key 2
//        System.out.println(cache.get(2));     // returns -1 (not found)     )
//        cache.put(4, 4);    // evicts key 1
//        System.out.println(cache.get(1));     // returns -1 (not found)
//        System.out.println(cache.get(3));     // returns 3
//        System.out.println(cache.get(4));     // returns 4

        //test two:
        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        cache.put(4, 1);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
    }
}
