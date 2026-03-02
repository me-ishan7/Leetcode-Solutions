/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Stack<Integer> s = new Stack<>();
        Node temp = head;
        
        while(temp != null){
            s.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null) {
            int val = s.peek();
            temp.data = val;
            s.pop();
            temp = temp.next;
        }
       
        return head;
    }
}