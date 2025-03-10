class Solution {
    public Node flatten(Node head) {
        if(head == null) return head;
        Node pseudoHead = new Node(0,null,head,null);
        Node curr, prev = pseudoHead;
        Deque<Node> st = new ArrayDeque<>();
        st.push(head);
        while(!st.isEmpty()){
            curr = st.pop();
            prev.next = curr;
            curr.prev = prev;
            if(curr.next != null) st.push(curr.next);
            if(curr.child != null){
                st.push(curr.child);
                curr.child = null;
            }
            prev = curr;
        }
        pseudoHead.next.prev = null;
        return pseudoHead.next;

        //TC - O(n), SC - O(n)
    }


    // Recursive approach
    /*public Node flatten(Node head) {
        if(head == null) return head;
        Node pseudoHead = new Node(0,null,head,null);
        flattenDFS(pseudoHead,head);
        pseudoHead.next.prev = null;
        return pseudoHead.next;
        
    }
    public Node flattenDFS(Node prev,Node curr){
        if(curr == null) return prev;
        curr.prev = prev;
        prev.next = curr;
        Node tempNext = curr.next;
        Node tail = flattenDFS(curr,curr.child);
        curr.child = null;
        return flattenDFS(tail,tempNext);
    }
    //TC - O(n), SC - O(n)
    */
}
