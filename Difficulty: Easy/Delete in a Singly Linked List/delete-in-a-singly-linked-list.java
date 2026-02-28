/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        
       if(head == null) return null;
       
       if(x == 1) return head.next;
           
       Node temp = head;
       int count = 1;
       while(temp != null && count < x - 1){
           temp = temp.next;
           count++;
       }
       
       if(temp != null && temp.next != null){
           temp.next = temp.next.next;
       }
        return head;
    
    }
}