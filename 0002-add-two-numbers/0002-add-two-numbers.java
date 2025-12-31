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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        // Loop while there are digits to process or a leftover carry
        while (l1 != null || l2 != null || carry != 0) {
            // Get values from lists, or 0 if we reached the end of a list
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Standard addition math
            int sum = carry + x + y;
            carry = sum / 10; // The digit to carry to the next step
            
            // Create a new node with the single digit (0-9)
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            // Advance l1 and l2 if they aren't empty
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next; // Skip the dummy 0
    }
    
}