/* You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself. */

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
import java.math.BigInteger;
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger sum = new BigInteger("0");
        BigInteger mult = new BigInteger("1");
        while (l1 != null) {
            sum = sum.add(mult.multiply(new BigInteger("" + l1.val)));
            mult = mult.multiply(new BigInteger("10"));
            l1 = l1.next;
        }
        mult = new BigInteger("1");
        while (l2 != null) {
            sum = sum.add(mult.multiply(new BigInteger("" + l2.val)));
            mult = mult.multiply(new BigInteger("10"));
            l2 = l2.next;
        }
        
        ListNode sumList = new ListNode(sum.mod(new BigInteger("10")).intValue());
        sum = sum.divide(new BigInteger("10"));
        ListNode temp = sumList;
      
        while (sum.signum() == 1) {
            int remainder = sum.remainder(new BigInteger("10")).intValue();
            temp.next = new ListNode(remainder);
            sum = sum.divide(new BigInteger("10"));
            temp = temp.next;
        }
        return sumList;
    }
}
