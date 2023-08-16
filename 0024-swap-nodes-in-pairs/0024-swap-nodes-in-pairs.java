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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode iter = head;
        ListNode res = head.next;
        ListNode prevIter = null;
        while(iter!=null && iter.next!=null){
            ListNode node1 = iter;
            ListNode node2 = iter.next;
            node1.next = node2.next;
            node2.next = node1;
            
            if(prevIter!=null) prevIter.next = node2;
            prevIter = node1;
            iter = node1.next;
        }
        return res;
    }
}