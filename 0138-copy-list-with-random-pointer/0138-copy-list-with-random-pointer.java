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
        HashMap<Node,Node> map = new HashMap<>();
        Node iter = head;
        while(iter!=null){
            Node newNode = new Node(iter.val);
            map.put(iter,newNode);
            iter=iter.next;
        }
        iter = head;
        
        Node newHead = map.get(iter);
        Node res = newHead;
        while(iter!=null){
            newHead.next = map.get(iter.next);
            newHead.random = map.get(iter.random);
            newHead = newHead.next;
            iter = iter.next;
        }
        return res;
    }
}