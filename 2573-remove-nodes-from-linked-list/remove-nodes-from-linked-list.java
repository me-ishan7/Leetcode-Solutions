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
    public ListNode removeNodes(ListNode head) {

        Deque<Integer> st = new ArrayDeque<>();

        ListNode temp = head;

        while(temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }
        ListNode newHead = new ListNode(st.pop());
        temp = newHead;

        while(!st.isEmpty()) {
            if(st.peek() < temp.val) st.pop();
            else{
                ListNode newNode = new ListNode(st.pop());
                newNode.next = temp;
                temp = newNode;
                newHead = newNode;     
            }
        }
        return newHead;
    }
}