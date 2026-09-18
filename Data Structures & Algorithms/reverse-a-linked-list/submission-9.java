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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;//first we initialize previous to be null (previous node before node 0)

        while (head != null){//create loop to invert list (with two pts)
            ListNode next = head.next;//Store the value of head.next(where next is pointing to rn)
            head.next = prev;//we make head point to previous (essentially inverting the node pointer & also "breaking" the pointer to next[where the og value of head.next is stored])

            //traverse "1 unit" through the list
            prev = head;//the value of head will become the new previous/previous inherits the value of head (so if head was 1 and previous 0, now previous is 1)
            head = next;//next (value of head.next) becomes the new head

            //loop will stop when the last element is considered the previous, given that the while loop only stops when head is equal to null
        }
        return prev;//we return prev because this is now the value of the top-most element of the list (technically the head, just not literally because we needed to make null the head in order to stop the while loop)
    }
    
}
