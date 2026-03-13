class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = head;
        ListNode curr = dummy;

        while(temp != null) {
            if(temp.val == val){
                ListNode next = temp.next;
                curr.next = temp.next;
                temp.next = null;
                temp = next;
            }
            else {
                curr = curr.next;
                temp = temp.next;
            } 
        }
        return dummy.next;
    }
}