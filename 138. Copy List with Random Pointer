class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node ptr = head;
        while(ptr != null){
            Node newNode = new Node(ptr.val,null,null);
            newNode.next = ptr.next;
            ptr.next = newNode;
            ptr = newNode.next;
        }
        ptr = head;
        while(ptr != null){
            ptr.next.random = (ptr.random != null) ? ptr.random.next : null;
            ptr = ptr.next.next;
        }
        Node ptr_old_list = head;
        Node ptr_new_list = head.next;
        Node head_new = head.next;
        while(ptr_old_list != null){
            ptr_old_list.next = ptr_old_list.next.next;
            ptr_new_list.next = (ptr_new_list.next != null) ? ptr_new_list.next.next : null;
            ptr_old_list = ptr_old_list.next;
            ptr_new_list = ptr_new_list.next;
        }
        return head_new;
    }
    //TC - O(n), SC-O(n)
    
    //Iterative solution - 
    /*
        HashMap<Node,Node> visited = new HashMap<>();

        public Node copyRandomList(Node head) {
            if(head == null) return null;
            Node oldNode = head;
            Node newNode = new Node(oldNode.val,null,null);
            this.visited.put(oldNode,newNode);
            while(oldNode != null){
                newNode.random = getClonedNode(oldNode.random);
                newNode.next = getClonedNode(oldNode.next);
                oldNode = oldNode.next;
                newNode = newNode.next;
            }
            return this.visited.get(head);
        }

        public Node getClonedNode(Node node){
            if(node != null){
                if(this.visited.containsKey(node)){
                    return this.visited.get(node);
                } else {
                    this.visited.put(node, new Node(node.val,null,null));
                    return this.visited.get(node);
                }
            } 
            return null;
        }
        //TC - O(n), SC - O(n)
    */


    //Recursive solution
    /*
        HashMap<Node,Node> visitedHash = new HashMap<>();

        public Node copyRandomList(Node head) {
            if(head == null) return null;
            if(this.visitedHash.containsKey(head)){
                return this.visitedHash.get(head);
            }
            Node node = new Node(head.val,null,null);
            this.visitedHash.put(head,node);
            node.next = this.copyRandomList(head.next);
            node.random = this.copyRandomList(head.random);
            return node;        
        }
        //TC - O(n), SC - O(n)
     */
}
