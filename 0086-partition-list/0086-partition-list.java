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
    public ListNode partition(ListNode head, int x) {
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);
        ListNode iter1 = list1;
        ListNode iter2 = list2;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val<x){
                iter1.next = curr;
                iter1 = iter1.next;
            }
            else{
                iter2.next = curr;
                iter2 = iter2.next;
            }
            curr = curr.next;
        }
        iter2.next=null;
        iter1.next = list2.next;
        return list1.next;
    }
   
}