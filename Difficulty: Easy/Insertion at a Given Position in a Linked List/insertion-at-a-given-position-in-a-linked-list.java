/* 
class Node { 
    int data; 
    Node next; 
    Node(int x) { data = x; next = null; } 
} 
*/

class Solution {
    public Node insertPos(Node head, int pos, int val) {
        Node newNode = new Node(val);
        
        // Step 1: Handle insertion at the head (position 1)
        if (pos == 1) {
            newNode.next = head;
            return newNode; // The new node becomes the new head
        }
        
        // Step 2: Handle empty list when position is greater than 1
        if (head == null) {
            return null;
        }
        
        Node curr = head;
        
        // Step 3: Traverse to the (pos - 1)-th node
        // We need to move pos - 2 times to reach the node right before the insertion point
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        
        // Step 4: If position is valid, link the new node
        if (curr != null) {
            newNode.next = curr.next;
            curr.next = newNode;
        }
        
        return head;
    }
}
