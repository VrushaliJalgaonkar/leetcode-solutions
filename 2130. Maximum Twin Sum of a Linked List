class Solution {
    //Approach-3 : Reverse second half list in place
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        // Get middle of the linked list.
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reverse second half of the linked list.
        ListNode nextNode, prev = null;
        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        ListNode start = head;
        int maximumSum = 0;
        while (prev != null) {
            maximumSum = Math.max(maximumSum, start.val + prev.val);
            prev = prev.next;
            start = start.next;
        }

        return maximumSum;
    }
    // TC - O(n)
    // SC - O(1)


    /*
    Approach-2 : Using stack
    public int pairSum(ListNode head) {
        ListNode curr = head;
        Stack<Integer> st = new Stack<>();
        while(curr != null){
            st.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        int size = st.size(), max = 0, count = 1;
        while(count <= size/2){
            max = Math.max(max, curr.val + st.peek());
            st.pop();
            curr = curr.next;
            count++;
        }
        return max;
    }
    TC - O(n)
    SC - O(n)
    */

    /* 
    Approach-1 : list of integers
    public int pairSum(ListNode head) {
        ListNode curr = head;
        List<Integer> values = new ArrayList<>();
        while(curr != null){
            values.add(curr.val);
            curr = curr.next;
        }
        int i = 0, j = values.size() - 1;
        int max = 0;
        while(i < j){
            max = Math.max(max, values.get(i) + values.get(j));
            i++;
            j--;
        }
        return max;
    }
    TC - O(n)
    SC - O(n)
    */
}
