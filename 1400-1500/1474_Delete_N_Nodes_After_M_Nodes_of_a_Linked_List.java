class Solution {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode currNode=head, lastMNode=head;
        while(currNode != null){
            int mCount = m, nCount = n;
            while(currNode != null && mCount != 0){
                lastMNode = currNode;
                currNode = currNode.next;
                mCount--;
            }
            while(currNode != null && nCount != 0){
                currNode = currNode.next;
                nCount--;
            }
            lastMNode.next = currNode;
        }
        return head;
    }
}
//TC - O(n)
//SC - O(1)
