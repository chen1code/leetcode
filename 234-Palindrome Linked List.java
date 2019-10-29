/*
Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
*/

"""
思路：依靠反转链表实现。tips:反转链表会改变原有链表，
所以先将原链表中的值存储在list(或者数组，使用list是方便添加元素)中，
然后取值比较。
运行时间长，占用空间大

Solution -- Java

"""

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode old_h = head;
		List<Integer> arr=new ArrayList<Integer>();
		while(old_h != null) {
			arr.add(old_h.val);
			old_h = old_h.next;
		}
        ListNode new_listNode = reverseList(head);
        int i = 0;
        while( i < arr.size() && new_listNode != null){
            if(arr.get(i) != new_listNode.val){
                return false;
            }
            new_listNode = new_listNode.next;
            i++;
        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }
}

"""
思路：依靠反转链表
该方法是将原链表分为两部分，反转其中一部分与另一部分相比即可
运行时间少且占用空间小

Solution -- Java
"""

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
}

public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
