package leetcode.t237;

import java.util.Stack;

/**
 * Created by a on 2015/6/9.
 */

public class Solution {
    public ListNode reverseList(ListNode head) {
//        ListNode previous = null;
//        while (head != null) {
//            ListNode nextNode = head.next;
//            head.next = previous;
//            previous = head;
//            head = nextNode;
//        }
//
//        return previous;
        Stack<ListNode> stack = new Stack<ListNode>();

        // put all the nodes into the stack
        while (head != null) {
            stack.add(head);
            head = head.next;
        }

        //reverse the linked list
        ListNode current = stack.pop();
        head = current;
        while (stack.empty() != true) {
            ListNode next = stack.pop();
            //set the pointer to null, so the last node will not point to the first node.
            next.next = null;
            current.next = next;
            current = next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);

        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        ListNode bbb = new Solution().reverseList(null);
        System.out.print(bbb);
    }

}

