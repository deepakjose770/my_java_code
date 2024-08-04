package EasyQ;

import com.deepak.util.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListTest {
    public static void main(String[] args) {

        ListNode<Integer> commonNode = new ListNode<>(8);
        commonNode.next = new ListNode<>(4);

        ListNode<Integer> headOne = new ListNode<>(4);
        headOne.next = new ListNode<>(1);
        headOne.next.next = commonNode;

        ListNode<Integer> headTwo = new ListNode<>(6);
        headTwo.next = new ListNode<>(1);
        headTwo.next.next = commonNode;

        Set<ListNode> nodeSet = new HashSet<>();
        nodeSet.add(commonNode);

        System.out.println("The result is "+ nodeSet.contains(commonNode));



    }
}
