public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slwPtr = head, fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slwPtr = slwPtr.next;
            fastPtr = fastPtr.next.next;
            if(slwPtr == fastPtr) return true;
        }
        return false;
    }
}
// TC --> O(n), SC --> O(1)
