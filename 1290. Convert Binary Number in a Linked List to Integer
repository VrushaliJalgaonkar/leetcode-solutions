class Solution {
    public int getDecimalValue(ListNode head) {
        int num = head.val;
        while(head.next != null){
            num = num * 2 + head.next.val;
            //num = (num << 1) | head.next.val; // Bit manipulation
            head = head.next;
        }
        return num;
    }
    //TC - O(n), SC - O(1)
}
