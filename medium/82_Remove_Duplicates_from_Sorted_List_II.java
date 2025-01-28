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
    static ListNode ref;
    public static ListNode deleteDuplicates(ListNode head) {
        list = null;
        ref= null;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ListNode current = head;
        while (current != null) {
            if (hashMap.containsKey(current.val)) {
                hashMap.replace(current.val, hashMap.get(current.val) + 1);
            } else {
                hashMap.put(current.val, 1);
            }
            current = current.next;
        }

         TreeMap<Integer, Integer> sortedMap = new TreeMap(hashMap);

        for(Integer value : sortedMap.keySet()){
            if(!(hashMap.get(value) > 1)){
                if(list == null){
                    list = new ListNode(value);
                    ref = list;
                }
                else{
                    ref.next = new ListNode(value);
                    ref = ref.next;
                }
            }
        }
        return list;
    }
}
