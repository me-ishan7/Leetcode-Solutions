/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        
        Node newNode = new Node(x);
        
        if(head == null) return newNode;
        
        if(p == 0){
            Node next = head.next;
            head.next = newNode;
            newNode.prev = head;
            newNode.next = next;
            if(next != null) 
                next.prev = newNode;
            
            return head;
        }
        
        Node temp = head;
        
        int count = 0;
        while(temp != null && count < p) {
            temp = temp.next;
            count++;
        }
        
        if(temp == null) {
            return head;
        }
        Node next = temp.next;
        
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = next;
        if(next != null)
            next.prev = newNode;
            
        return head;
    }
}