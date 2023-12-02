class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int n=1;
        ListNode ptr = head;
        while(ptr.next != null){
            n++;
            ptr = ptr.next;
        }
        ptr.next = head;
        ListNode newTail = head;
        for(int i=0;i<n-k%n-1;i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
//TC - O(n), SC - O(1)
