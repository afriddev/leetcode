
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Linkedlist {
    static ListNode list;

    Linkedlist() {

    }

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

    public static ListNode mergeSortedLists(ListNode list1, ListNode list2) {
        list = null;
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode currentList1 = list1;
        ListNode currentList2 = list2;

        while (currentList1 != null) {

            if (currentList1 != null && currentList2 != null) {
                if (currentList1.val <= currentList2.val) {

                    append(currentList1.val);
                    append(currentList2.val);

                } else {
                    append(currentList2.val);
                    append(currentList1.val);

                }
            } else {
                if (currentList1 == null) {
                    append(currentList2.val);
                } else {
                    append(currentList1.val);
                }
            }
            currentList1 = currentList1.next;
            if (currentList2 != null)
                currentList2 = currentList2.next;
        }

        while (currentList2 != null) {
            append(currentList2.val);
            currentList2 = currentList2.next;

        }


        ListNode cList1 = list;

		while(cList1 != null){


			ListNode cList2 = cList1.next;
			while (cList2 != null ) {
				if(cList1.val >  cList2.val){
					int swapValue = cList1.val;
					cList1.val  = cList2.val;
					cList2.val = swapValue;
				}
				cList2 = cList2.next;
			}


			cList1 = cList1.next;
		}



        return list;

    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        Linkedlist result = new Linkedlist();
        return result.mergeSortedLists(list1, list2);

    }
}
