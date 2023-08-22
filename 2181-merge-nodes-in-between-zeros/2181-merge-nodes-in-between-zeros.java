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
    public ListNode mergeNodes(ListNode head) {
        ListNode iter = head.next;
        int currSum=0;
        ListNode res = new ListNode(0);
        ListNode temp = res;
        while(iter!=null){
            currSum+=iter.val;
            if(iter.val==0){
                temp.next=new ListNode(currSum);
                currSum=0;
                temp = temp.next;
            }
            iter = iter.next;
        }
        return res.next;
    }
}