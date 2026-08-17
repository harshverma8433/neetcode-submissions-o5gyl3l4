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
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = new ListNode(-1);
        ListNode h = head;
        ListNode ptr = h.next;
        while(h.next != null){
            ptr = h.next;
            h.next = temp;
            temp = h;
            h = ptr;
        }
        h.next = temp;
        head.next = null;
        return h;

    }
}