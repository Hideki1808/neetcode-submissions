/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {} - creates an empty node
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head!=null){
            //head = head.next --> this is how you usually traverse through a Linkedlist. head(0) becomes head(1), and so on for every iteration until the last number of the list is reached, since the head.next for that would be null
            ListNode next_node = head.next; //we created a variable (next_node) that becomes the head next node for every iteration. So if head = 0 (and the subsequent number is 1) next = 1
            head.next = prev;
            prev = head;
            head = next_node;

        }
        return prev;
    }
}
