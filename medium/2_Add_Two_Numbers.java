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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        list = null;
        int carry = 0;

        ListNode current1 = l1;
        ListNode current2 = l2;
        while (current1 != null) {
            if (current1 != null && current2 != null) {
                if (current1.val + current2.val + carry >= 10) {
                    append(current1.val + current2.val + carry - 10);
                    carry = 1;
                } else {
                    append(current1.val + current2.val + carry);
                    carry = 0;

                }
            }
            else{
                if(carry + current1.val >= 10 ){
                    append(carry + current1.val - 10);
                    carry = 1;
                }
                else{
                    append(carry + current1.val);
                    carry = 0;
                }
            }
            current1 = current1.next;

            if (current2 != null && current2.next != null) {
                current2 = current2.next;
            } else {
                current2 = null;
            }

        }

        while (current2 != null) {

            if (current2.val + carry >= 10) {
                append(current2.val + carry - 10);
                carry = 1;
            } else {
                append(current2.val + carry);
                carry = 0;
            }

            current2 = current2.next;

        }
        if(carry > 0){
            append(1);
        }

        return list;

    }

}
