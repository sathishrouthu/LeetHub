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
    ListNode reverseList(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode nex = null;
        while(curr!=null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverseList(slow);
        ListNode first = head;
        ListNode second = slow;
        int maxSum = 0;
        while(second!=null){
            maxSum = Math.max(first.val+second.val,maxSum);
            first = first.next;
            second = second.next;
        }
        return maxSum;
    }
}

// 1 2 3 4 5 6 