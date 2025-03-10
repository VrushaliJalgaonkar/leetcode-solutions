class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode reverseSubList = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverseSubList;
    }
}

// Time complexity - O(n)
// SPace complexity - O(n)

//Iterative solution
/*
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
} 
// Time complexity - O(n)
// SPace complexity - O(1)
*/
