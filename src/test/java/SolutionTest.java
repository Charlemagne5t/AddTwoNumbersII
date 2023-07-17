import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    public static int toInteger(ListNode root) {
        StringBuilder sb = new StringBuilder();
        while (root != null) {
            sb.append(root.val);
            root = root.next;
        }
        return Integer.parseInt(sb.toString());
    }

    @Test
    public void reverseTest(){
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        int expected = 3427;
        int actual = toInteger(new Solution().reverse(l1));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addTwoNumbersTest1() {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode expected = new ListNode(7);
        expected.next = new ListNode(8);
        expected.next.next = new ListNode(0);
        expected.next.next.next = new ListNode(7);

        ListNode actual = new Solution().addTwoNumbers(l1, l2);

        Assertions.assertEquals(toInteger(expected), toInteger(actual));

    }

    @Test
    public void addTwoNumbersTest2() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode expected = new ListNode(8);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(7);

        ListNode actual = new Solution().addTwoNumbers(l1, l2);

        Assertions.assertEquals(toInteger(expected), toInteger(actual));

    }

    @Test
    public void addTwoNumbersTest3() {
        ListNode l1 = new ListNode(0);

        ListNode l2 = new ListNode(0);

        ListNode expected = new ListNode(0);
        ListNode actual = new Solution().addTwoNumbers(l1, l2);

        Assertions.assertEquals(toInteger(expected), toInteger(actual));

    }

}
