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
    public void reverseList(ListNode s,ListNode e){
        ListNode pre = null,curr=s,nex = null;
        while(curr!=e){
            nex = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nex;
        }
        curr.next = pre;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1) return head;
        ListNode s = head, e = head;
        int i = k-1;
        while(i!=0){
            e=e.next;
            if(e==null) return head;
            i--;
        }
        ListNode rest = reverseKGroup(e.next,k);
        reverseList(s,e);
        s.next = rest;
        return e;
    }
}