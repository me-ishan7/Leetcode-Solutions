/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        
        Node slow = head;
        Node fast = head;
        int len = 0;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast) {
                fast = slow.next;
                len = 1;
                while(fast != slow){
                    fast = fast.next;
                    len++;
                }
                return len;
            }
        }
        return len;
    }
}