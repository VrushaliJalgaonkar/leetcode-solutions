class Solution {

    public void printLinkedListInReverse(ImmutableListNode head) {
        if(head != null){
            printLinkedListInReverse(head.getNext());
            head.printValue();
        }
        //TC - O(n), SC - O(n)
    }

    //Using Stack
    /*public void printLinkedListInReverse(ImmutableListNode head) {
        Stack<ImmutableListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.getNext();
        }

        while (!stack.empty()) {
            ImmutableListNode node = stack.pop();
            node.printValue();
        }
        //TC - O(n), SC - O(n)
    }*/
}
