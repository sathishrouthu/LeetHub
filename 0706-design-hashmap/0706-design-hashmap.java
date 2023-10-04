class ListNode{
    int key,val;
    ListNode next;
    public ListNode(int key,int val,ListNode next){
        this.key = key;
        this.val = val;
        this.next = next;
    }
}    
class MyHashMap {
    final static int size = 19999;
    final static int prime = 25165843;
    ListNode[] data;
    
    public MyHashMap() {
        data = new ListNode[size]; 
    }
    
    private int hash(int key){
        return (int)((long)key * prime % size);
    }
    public void put(int key, int value) {
        remove(key);
        int idx = hash(key);
        ListNode head = data[idx];
        ListNode newNode = new ListNode(key,value,head);
        data[idx] = newNode;
    }
    
    public int get(int key) {
        int idx = hash(key);
        ListNode head = data[idx];
        if(head==null) return -1;
        while(head!=null){
            if(head.key==key) return head.val;
            head=head.next;
        }
        return -1;   
    }
    
    public void remove(int key) {
        int idx = hash(key);
        ListNode head = data[idx];
        if(head==null) return;
        if(data[idx].key==key) {
            data[idx]=data[idx].next;
            return;
        }
        while(head.next!=null){
            if(head.next.key == key) {
                head.next = head.next.next;
                return;
            }
            head=head.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */