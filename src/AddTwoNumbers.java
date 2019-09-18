/**
 * Created by edieye on 2017-08-17.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry){
        if (l1 == null && l2 == null) {
            return null;
        }
        else {
            int sum = ((l1 == null) ? 0 :l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
            carry = 0;
            if (sum >= 10) {
                carry = 1;
                sum = sum -  10;
            }
            ListNode n = new ListNode(sum);
            n.next = addTwoNumbers(((l1 == null) ? null : l1.next), ((l2== null) ? null : l2.next), carry);
            if (n.next == null && carry == 1){
                n.next = new ListNode(1);
            }
            return n;
        }
    }
}
