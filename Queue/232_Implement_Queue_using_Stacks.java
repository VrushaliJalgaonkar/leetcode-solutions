// Link : https://leetcode.com/problems/implement-queue-using-stacks/
// Last Practice on : 29-Jan-2024

class MyQueue {
    int front;
    Stack<Integer> st1;
    Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        if(st1.isEmpty()){
            front = x;
        }
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st2.push(x);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }
    
    public int pop() {
        int res = st1.pop();
        if(!st1.isEmpty()){
            front = st1.peek();
        }
        return res;
    }
    
    public int peek() {
        return front;
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
