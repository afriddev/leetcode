/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
   /**
     * Runtime - 0ms  
     * Beats - 100%
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     * 
     */
   
    static ListNode list = null;
    public static void append(int val) {
        if (list == null) {
            list = new ListNode(val);
        } else {
            ListNode current = list;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(val);
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        list = null;
        ListNode current = head;
        int nodeLength = 0;
        while (current != null) {
            nodeLength = nodeLength + 1;
            current = current.next;
        }
        current = head;
        for (int index = 1; index <= nodeLength; index++) {
            if (nodeLength - n + 1 == index) {
                current = current.next;
                continue;
            }
            append(current.val);
            current = current.next;
        }
        return list;
    }
}
