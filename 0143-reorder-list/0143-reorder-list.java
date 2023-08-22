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
    public ListNode reverseList(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode nex = null;
        while(curr!=null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr= nex;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverseList(slow.next);
        ListNode iter = head;
        ListNode twinIter = slow;
        while(iter!=twinIter && iter.next!=null){
            ListNode nextIter = iter.next;
            iter.next = twinIter.next;
            twinIter.next = twinIter.next.next;
            iter.next.next = nextIter;
            
            iter = nextIter;
        }
    }
}

// 1 2 3 4 5
// 1 2 3 5 4
// 1 5 2 3 4
// 1 5 2 4 3 x

// 1 2 3 4
// 1 2 4 3
// 1 4 2 3
