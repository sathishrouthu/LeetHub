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
    public ListNode mergeLists(ListNode l1,ListNode l2){
        
        // if(l1.val > l2.val) return mergeLists(l2,l1);
        ListNode res = new ListNode(0);
        ListNode temp = res;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        if(l1!=null)temp.next = l1;
        else temp.next = l2;
        return res.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        
        int n = lists.length;
        if(n==0) return null;
        int i=1;
        
        while(i<n){
            // merge two lists
            lists[i] = mergeLists(lists[i],lists[i-1]);
            i++;
        }
        return lists[n-1];
    }
}