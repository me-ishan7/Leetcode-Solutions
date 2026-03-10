/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        Node left = head;
        Node temp = head;
        
        while(temp.next != null) {
            temp = temp.next;
        }
        Node right = temp;
        
        while(left.data < right.data){
            int sum = left.data + right.data;
            if(sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                list.add(pair);
                left = left.next;
                right = right.prev;
            }
            else if(sum > target) right = right.prev;
            else left = left.next;
        }
        return list;
    }
}
