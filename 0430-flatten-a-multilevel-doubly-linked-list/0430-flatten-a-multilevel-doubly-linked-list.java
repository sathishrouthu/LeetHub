/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public void combine(Node start,Node mid,Node end){
        start.next = mid;
        mid.prev = start;
        Node temp = mid;
        while(temp.next!=null)
            temp = temp.next;
        temp.next = end;
        if(end!=null)
        end.prev = temp;
    }
    public Node flatten(Node head) {
        Node iter = head;
        while(iter!=null){
            if(iter.child!=null){
                Node nextIter = iter.next;
                Node flattenChild = flatten(iter.child);
                combine(iter,iter.child,iter.next);
                iter.child = null;
                iter = nextIter;
            }
            else
                iter = iter.next;
        }
        return head;
    }
}