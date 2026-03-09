/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        if(head == null) return head;
        
        Node revHead = reverseLL(head);
        Node temp = revHead;
        int carry = 1;
        
        while(temp != null) {
            
            if(temp.data != 9) {
                temp.data += carry;
                break;
            }
            else {
                temp.data = 0;
            }
            temp = temp.next;
        }
        revHead = reverseLL(revHead);
        
        if(temp == null) {
            Node newNode = new Node(1);
            newNode.next = revHead;
            return newNode;
        }
        
        return revHead;
    }
    
    static Node reverseLL(Node head){
        Node temp = head;
        Node prev = null, next = head.next;
        
        while(temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}