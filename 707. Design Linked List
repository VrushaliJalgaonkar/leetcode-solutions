class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        ListNode curr = head;
        for(int i=0;i<index+1;i++){
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        if(index < 0){
            index = 0;
        }
        ++size;
        ListNode pred = head;
        for(int i=0;i<index;i++){
            pred = pred.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = pred.next;
        pred.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        size--;
        ListNode pred = head;
        for(int i = 0; i < index; ++i){
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }
}

/* TC --> O(1)\mathcal{O}(1)O(1) for addAtHead.
O(k)\mathcal{O}(k)O(k) for get, addAtIndex, and deleteAtIndex,
where kkk is an index of the element to get, add or delete.
O(N)\mathcal{O}(N)O(N) for addAtTail.*/

// SC --> O(1)\mathcal{O}(1)O(1) for all operations.

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
