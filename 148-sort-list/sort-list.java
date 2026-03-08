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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        return MergeSort(head);
    }
    
    static ListNode MergeSort(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode middle = findMiddle(head);

        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null;

        leftHead = MergeSort(leftHead);
        rightHead = MergeSort(rightHead);
        return mergeTwoLists(leftHead, rightHead); 
    }

    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;

        ListNode t1 = l1, t2 = l2;

        while(t1 != null && t2 != null) {
            if(t1.val < t2.val) {
                temp.next = t1; 
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        if(t1 == null) temp.next = t2;
        else if(t2 == null) temp.next = t1;
        
        return ans.next;
    }

    static ListNode findMiddle(ListNode head){
        
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}