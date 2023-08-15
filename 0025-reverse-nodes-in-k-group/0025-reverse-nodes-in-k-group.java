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
        // if(head==null || head.next==null || k==1) return head;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode beforeStart = dummyHead;
        int i=0;
        ListNode end = head;
        while(end!=null){
            i++;
            if(i%k==0){
                ListNode start    = beforeStart.next;
                ListNode afterEnd = end.next;
                reverseList(start,end);
                beforeStart.next = end;
                start.next = afterEnd;
                beforeStart = start;
                end = afterEnd;
            }
            else{
                end=end.next;
            }
        }
        return dummyHead.next;
    }
}