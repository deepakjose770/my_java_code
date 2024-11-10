package dpk.test;

import com.deepak.util.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Retesting {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println();
        //new Retesting().testMethod();
    }

    public static ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> dummy = new ListNode<>(0);
        ListNode<Integer> current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 == null) ? 0: l1.val;
            int y = l2 ==null ? 0: l2.val;

            int sum  = carry + x + y;
            carry = sum /10;
            current.val = sum % 10;
            current = current.next;
            if (l1 != null)l1 = l1.next;
            if (l2 != null)l2 = l2.next;
        }
        return dummy.next;
    }
}
