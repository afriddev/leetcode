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
    static ListNode list;
    static ListNode lastNode;
    public static ListNode deleteDuplicates(ListNode head) {
        list = null;
        lastNode = null;
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        ListNode current = head;
        while (current != null) {
            if (!hashSet.contains(current.val)) {
                hashSet.add(current.val);
                
            if (list == null) {
                list = new ListNode(current.val);
                lastNode = list;
            }
            else{
                lastNode.next = new ListNode(current.val);
                lastNode = lastNode.next;
            }
            }
            current = current.next;
        }
        return list;
    }

}
