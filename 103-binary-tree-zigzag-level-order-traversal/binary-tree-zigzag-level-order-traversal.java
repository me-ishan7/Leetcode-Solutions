/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        boolean leftToRight = true;

        while(!q.isEmpty()) {
            int size = q.size();

            List<Integer> temp = new ArrayList<>(
                Collections.nCopies(size, 0)
            );

            for(int i = 0; i < size; i++) {

                int index = leftToRight ? i : size - 1 - i;

                TreeNode curr = q.poll();

                if(curr.left != null) 
                    q.offer(curr.left);

                if(curr.right != null) 
                    q.offer(curr.right);

                temp.set(index, curr.val);
            }

            ans.add(temp);
            leftToRight = !leftToRight;
            
        }
        return ans;
    }
}