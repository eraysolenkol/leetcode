/* You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively. */



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
    
    public int listLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next; 
        }
        return length;
    }
    
    
    public ListNode deleteMiddle(ListNode head) {
        int length = listLength(head);
        
        if (length == 1) return null;
        
        ListNode temp = head;
        ListNode prev;
        
        for (int i = 0; i < (length/2) - 1; i++) {
            temp = temp.next;
        }
        
        prev = temp;
        
        try {
            prev.next = temp.next.next;
        } catch(Exception e) {
            prev.next = null;
        }
        return head;
    }
}
