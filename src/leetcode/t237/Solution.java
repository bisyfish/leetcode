package leetcode.t237;

import java.util.Stack;

/**
 * Created by a on 2015/6/9.
 */

public class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
