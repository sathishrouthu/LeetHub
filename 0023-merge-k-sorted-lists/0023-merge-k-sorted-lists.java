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
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val > l2.val) return mergeLists(l2,l1);
        
        ListNode res = l1;
        while(l1!=null && l2!=null){
            ListNode temp = null;
            while(l1!=null && l1.val<=l2.val){
                temp = l1;
                l1 = l1.next;
            }
            temp.next = l2;
            
            ListNode t =l1;
            l1 = l2;
            l2 = t;
        }
        return res;
    }
    public ListNode util(ListNode[] lists,int start,int end){
        if(start==end) return lists[start];
        int mid = (start+end)/2;
        ListNode left = util(lists,start,mid);
        ListNode right = util(lists,mid+1,end);
        return mergeLists(left,right);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n==0) return null;
        return util(lists,0,n-1);
    }
}