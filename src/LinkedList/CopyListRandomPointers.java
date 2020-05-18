package LinkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by edieye on 2020-05-16.
 */
public class CopyListRandomPointers {

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).rand = map.get(curr.rand);
        }
        return map.get(head);
    }
}
