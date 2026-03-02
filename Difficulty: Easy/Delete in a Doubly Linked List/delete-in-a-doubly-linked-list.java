/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int k) {
        // code here
        if(head == null) return null;
        
        Node temp = head;
        int count = 1;
        
        while(temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        
        // k > length
        if(temp == null) {
            return head;
        }
        
        Node prev = temp.prev;
        Node next = temp.next;
        
        //deleting head
        if(prev == null) {
            head = next;
            if(next != null)
                next.prev = null;
            return head;
        }
        
        // deleting tail
        if(next == null) {
            prev.next = null;
            temp.prev = null;
            return head;
        }
        
        //deleting middle
        prev.next = next;
        next.prev = prev;
        
        temp.next = null;
        temp.prev = null;
        
        return head;
        
    }
}