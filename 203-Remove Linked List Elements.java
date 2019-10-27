/*
Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
*/

"""
Solution -- java
"""

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        dummy.next = head;
        while(dummy.next!= null) {
            if(dummy.next.val == val){
                dummy.next = dummy.next.next;
            }else{
                dummy = dummy.next;
            }
        }
        return temp.next;
    }
}
