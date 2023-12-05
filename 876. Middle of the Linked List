class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slwPtr = head, fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slwPtr = slwPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slwPtr;
    }
}
// TC - O(n)
// SC - O(1)
