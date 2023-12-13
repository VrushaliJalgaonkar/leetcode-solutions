class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);
        ListNode p1 = head, p2 = secondHalfStart;
        boolean result = true;
        while(result && p2 != null){
            if(p1.val != p2.val) result = false;
            p1 = p1.next;
            p2 = p2.next;
        }
        firstHalfEnd.next = reverseList(secondHalfStart);
        return result;

    }
    public ListNode endOfFirstHalf(ListNode head){
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null, curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
// TC - O(n), SC - O(1)


/*
    Recursive approach:

    TC - O(n), SC - O(n)

    private ListNode frontPointer;
    public boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);


    }
    public boolean recursivelyCheck(ListNode currNode){
        if(currNode != null){
            if(!recursivelyCheck(currNode.next)) return false;
            if(currNode.val != frontPointer.val) return false;
            frontPointer = frontPointer.next;
        }
        return true;
    }
 */
