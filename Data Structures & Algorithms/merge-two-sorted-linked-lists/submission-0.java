/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                curr.next = new ListNode(list1.val);
                list1=list1.next;
            }
            else {
                curr.next = new ListNode(list2.val);
                list2=list2.next;
            }
            curr = curr.next;
        }

        if(list1 == null) curr.next = list2;
        if (list2 == null) curr.next = list1;

        return head.next;
    }
}

/**
Verification 1,2,3 & 1,4
                   p
                       p
0-1-1-2-3-4
h
        c



Clarify
max size of lists:
max values in list:
space constraint: none

Test Cases

1,2,3 & 3,4

4,8 & 1,5

Approach
pointer to node in each list
check which is smaller
add smaller to new list
push pointer of smaller
once finished with one list
add the node of the other list to the end of the new list

TC/SC

TC: o(n) where n is num nodes in longest list
SC: O(n) where n is num nodes in resulting list





**/