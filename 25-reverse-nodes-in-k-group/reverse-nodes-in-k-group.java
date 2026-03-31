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
    public ListNode reverseKGroup(ListNode head, int k) {
        int len = k;
        ListNode temp = head;
        ListNode prevNode = temp;

        while(temp != null) {

            ListNode kthNode = getKthNode(temp, k);
            if(kthNode == null) break;

            ListNode nextNode = kthNode.next;

            kthNode.next = null;

            ListNode newHead = reverseLL(temp);

            if(head == temp) head = newHead;
            else {
                prevNode.next = kthNode;
            }

            temp.next = nextNode;
            prevNode = temp;
            temp = temp.next; 
        }
    return head;
    }

    static ListNode getKthNode(ListNode head, int k) {
        ListNode kthNode = head;
        k -= 1;
        while(kthNode != null && k > 0) {
            k -= 1;
            kthNode = kthNode.next;
        }
    return kthNode;
    }

    static ListNode reverseLL(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    return prev;
    }
}