// Link : https://leetcode.com/problems/design-circular-queue/description/
// Last Practice on : 5-Jan-2024

//Approach 2 : Singly Linked list
class Node {
    public int value;
    public Node nextNode;

    public Node(int value) {
        this.value = value;
        this.nextNode = null;
    }
}

class MyCircularQueue {
    private Node head, tail;
    private int count;
    private int capacity;

    public MyCircularQueue(int k) {
        this.count = 0;
        this.capacity = k;
    }

    public boolean enQueue(int value) {
        if (this.count == this.capacity) {
            return false;
        }
        Node newNode = new Node(value);
        if(this.count == 0){
            head = tail = newNode;
        } else{
            tail.nextNode = newNode;
            tail = newNode;
        }
        this.count += 1;
        return true;
    }

    public boolean deQueue() {
        if(this.count == 0){
            return false;
        }
        this.head = this.head.nextNode;
        this.count -= 1;
        return true;
    }

    public int Front() {
        if(this.count == 0){
            return -1;
        } else {
            return this.head.value;
        }
    }

    public int Rear() {
        if(this.count == 0){
            return -1;
        } else {
            return this.tail.value;
        }
    }

    public boolean isEmpty() {
        return (this.count == 0);
    }

    public boolean isFull() {
        return (this.count == this.capacity);
    }

    // TC - O(1), for all methods
    // SC - O(n)
}

/*
 * //Approach 1 : Array
 * class MyCircularQueue {
 * private int[] queue;
 * private int headIndex;
 * private int count;
 * private int capacity;
 * 
 * public MyCircularQueue(int k) {
    * this.capacity = k;
    * this.queue = new int[k];
    * this.count = 0;
    * this.headIndex = 0;
 * }
 * 
 * public boolean enQueue(int value) {
    * if(this.count == this.capacity){
    * return false;
    * }
    * this.queue[(this.headIndex + this.count) % this.capacity] = value;
    * this.count += 1;
    * return true;
 * }
 * 
 * public boolean deQueue() {
    * if(this.count == 0){
    * return false;
    * }
    * this.headIndex = (this.headIndex + 1) % this.capacity;
    * this.count -= 1;
    * return true;
 * }
 * 
 * public int Front() {
    * if(this.count == 0){
    * return -1;
    * }
    * return this.queue[this.headIndex];
    * }
    * 
    * public int Rear() {
    * if(this.count == 0){
    * return -1;
    * }
    * int tailIndex = (this.headIndex + this.count - 1) % this.capacity;
    * return this.queue[tailIndex];
 * }
 * 
 * public boolean isEmpty() {
 *      return (this.count == 0);
 * }
 * 
 * public boolean isFull() {
 *      return (this.count == this.capacity);
 * }
 * 
 * //TC - O(1), for all methods
 * //SC - O(n)
 * }
 */

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
