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
    //null -> 0 -> 1 -> 2 -> 3 -> null
    //        ^
    public ListNode reverseList(ListNode head) {
       ListNode prev = null, next = null;
       
       while (head!=null){
            //ListNode next = head.next;
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
       }
        return prev;
       
    }
}
