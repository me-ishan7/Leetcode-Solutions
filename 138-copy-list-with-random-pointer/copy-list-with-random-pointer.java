/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
    // Inserting copiedNodes in between
        while(temp != null) {
            Node copiedNode = new Node(temp.val);
            copiedNode.next = temp.next;
            temp.next = copiedNode;
            temp = temp.next.next;
        }
        temp = head;

        // Connect Random Pointer
        while(temp != null) {
            Node copiedNode = temp.next;
            if(temp.random != null) {
                copiedNode.random = temp.random.next;
            }
            else{
                copiedNode.random = temp.random;
            }
            temp = temp.next.next;
        }
        temp = head;

        //Connect next pointer
        
        Node dummy = new Node(-1);
        Node curr = dummy;
        while(temp != null) {
            curr.next = temp.next;
            curr = curr.next;
            temp.next = curr.next;
            temp = temp.next;
        }

        return dummy.next;
    }
}