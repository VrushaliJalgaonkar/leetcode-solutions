class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = head, next = head.next;
        while(next != null){
            int gcd = getGCD(prev.val,next.val);
            ListNode newNode = new ListNode(gcd);
            prev.next = newNode;
            newNode.next = next;
            prev = next;
            next = next.next;
        }
        return head;
        
    }
    private int getGCD(int x, int y){
        int r=0, a, b;  
        a = (x > y) ? x : y;
        b = (x < y) ? x : y;  
        r = b;  
        while(a % b != 0) {  
            r = a % b;  
            a = b;  
            b = r;  
        }  
        return r;
    }
    //TC - O(n), SC - O(1)
}
