public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reversedL1 = reverse(l1);
        ListNode reversedL2 = reverse(l2);
        ListNode preHead = new ListNode();

        ListNode reversedResult = new ListNode();
        preHead.next = reversedResult;
        int carry = 0;
        while (reversedL1 != null || reversedL2 != null) {
            int l1Val = 0;
            int l2Val = 0;
            if(reversedL1 != null){
                l1Val = reversedL1.val;
            }
            if(reversedL2 != null){
                l2Val = reversedL2.val;
            }
            reversedResult.val = (l1Val + l2Val + carry) % 10;
            carry = (l1Val + l2Val + carry) / 10;
            reversedResult.next = new ListNode();
            reversedResult = reversedResult.next;
            if(reversedL1 != null) {
                reversedL1 = reversedL1.next;
            }
            if(reversedL2 != null) {
                reversedL2 = reversedL2.next;
            }
        }
        if(carry != 0){
            reversedResult.val = carry;
        }
        ListNode result = reverse(preHead.next);
        if(result.val == 0 && result.next != null){
            return result.next;
        }else return result;
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
