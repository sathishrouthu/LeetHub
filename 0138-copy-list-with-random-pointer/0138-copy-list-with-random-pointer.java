/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node iter = head;
        while(iter!=null){
            Node nextIter = iter.next;
            iter.next = new Node(iter.val);
            iter.next.next = nextIter;
            iter = nextIter;
        }
        iter = head;
        while(iter!=null){
            if(iter.random!=null) iter.next.random = iter.random.next;
            iter = iter.next.next;
        }
        iter = head;
        Node res = iter.next;
        Node resIter = res;
        while(iter!=null){
            iter.next = iter.next.next;
            if(resIter.next!=null) resIter.next = resIter.next.next;
            iter = iter.next;
            resIter = resIter.next;
        }
        return res;
    }
}