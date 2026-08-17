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
    public void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        temp = head;
        for(int i=0;i<list.size()/2;i++){
            temp.val= list.get(i);
            temp = temp.next;
            temp.val = list.get(list.size() - i - 1);
            temp = temp.next;
        }

        if(list.size() % 2 != 0){
            temp.val = list.get(list.size()/2);

        }
    }
}