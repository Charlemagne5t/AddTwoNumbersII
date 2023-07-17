public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return null;
    }

    public ListNode reverse(ListNode root){
        ListNode previous = null;
        ListNode current = root;
        ListNode next = null;

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return  previous;
    }
}
