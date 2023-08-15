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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode temp = head;
        int n=1;
        while(temp.next!=null){
            temp = temp.next;
            n++;
        }
        k = k%n;
        k = n-k;
        temp.next = head;
        
        while(k!=0){
            k--;
            temp = head;
            head= head.next;
        }
        temp.next = null;
        return head;
    }
}