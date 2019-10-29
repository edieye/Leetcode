import java.util.HashMap;
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
        return 0;
    }

    public void put(int key, int value) {

    }

    private class ListNode {
        ListNode prev;
        ListNode next;
        int key;
        int val;


    }
}
