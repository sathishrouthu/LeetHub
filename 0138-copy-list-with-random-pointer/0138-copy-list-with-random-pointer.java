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
        if(head==null) return head;;
        Node iter = head;
        Node front;
        while(iter!=null){
            front = iter.next;
            iter.next = new Node(iter.val);
            iter.next.next = front;
            iter = front;
        }
        iter = head;
        while(iter!=null){
            if(iter.random!=null) iter.next.random = iter.random.next;
            iter = iter.next.next;
        }

        iter = head;
        Node copyHead = iter.next;
        Node copyIter;
        while(iter!=null){
            front = iter.next.next;
            copyIter = iter.next;
            if(front!=null) copyIter.next = front.next;
            iter.next = front;
            iter = front;
        }
        return copyHead;
    }
}