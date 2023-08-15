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
    public void reverseList(ListNode start,ListNode end){
        ListNode curr = start;
        ListNode prev = null;
        ListNode nex  = null;
        while(curr!=end){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        curr.next=prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1) return head;
        ListNode dummyHead = new ListNode(0,head);
        ListNode beforeStart = dummyHead;
        ListNode end = head;
        int i=0;
        while(end!=null){
            i++;
            if(i%k==0){
                ListNode start = beforeStart.next;
                ListNode afterEnd = end.next;
                reverseList(start,end);
                beforeStart.next = end;
                start.next = afterEnd;
                beforeStart = start;
                end = afterEnd;
            }
            else
                end = end.next;
        }
        return dummyHead.next;
    }
}