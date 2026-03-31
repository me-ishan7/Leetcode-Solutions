/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        // code here
       if(root == null || root.next == null) return root;
       
       Node mergedHead = flatten(root.next);
       
       return mergeList(root, mergedHead);
       
    }
    
    static Node mergeList(Node l1, Node l2) {
        Node ans = new Node(-1);
        Node temp = ans;
        
        while(l1 != null && l2 != null) {
            if(l1.data < l2.data) {
                temp.bottom = l1;
                l1 = l1.bottom;
            }
            else {
                temp.bottom = l2;
                l2 = l2.bottom;
            }
            temp = temp.bottom;
            temp.next = null;
        }
        temp.bottom = (l1 != null) ? l1 : l2;
        
        return ans.bottom;
        
    }
}