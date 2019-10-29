import java.util.List;
import java.util.Stack;

/**
 * Created by edieye on 2019-10-28.
 */
public class AddTwoNumbersII {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        ListNode head = null;
        int sum = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (!s1.isEmpty()) sum += s1.pop();
            if (!s2.isEmpty()) sum += s2.pop();
            ListNode n = new ListNode(sum % 10);
            if (head == null) {
                head = n;
            } else {
                n.next = head;
                head = n;
            }
            sum /= 10;
        }
        if (sum > 0) {
            ListNode n = new ListNode();
            n.next = head;
            head = n;
            return head;

        }
        return head;

    }

}
