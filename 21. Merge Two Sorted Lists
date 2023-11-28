class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(-1);
        ListNode tail = result;
        while(list1 != null && list2!= null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            } else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if(list1 != null){
            tail.next = list1;
        }
        if(list2 != null){
            tail.next = list2;
        }
        return result.next;
    }
    //TC - O(m+n), SC - O(1)
}
/*
//Recursive solution
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //base case
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode head;
        if(list1.val < list2.val){
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        head.next = mergeTwoLists(list1,list2);
        return head;
        
    }
//TC - O(m+n), SC - O(m+n)
 */
