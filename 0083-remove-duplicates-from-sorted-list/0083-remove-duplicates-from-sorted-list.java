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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode iter = head;
        while(iter!=null){
            ListNode temp = iter.next;
            while(temp!=null && temp.val==iter.val){
                temp = temp.next;
            }
            iter.next = temp;
            iter = temp;
        }
        System.gc();
        return head;
    }
}