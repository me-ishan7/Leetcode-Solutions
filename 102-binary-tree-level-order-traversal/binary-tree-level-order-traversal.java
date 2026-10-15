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
    List<List<Integer>> ans;
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) 
            return new ArrayList<>();

        ans = new ArrayList<>();
        traverse(root);
        return ans;
    }

    void traverse(TreeNode root) {

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();

            while(size-- != 0) {
                TreeNode front = q.poll();

                if(front.left != null)
                    q.add(front.left);

                if(front.right != null)
                    q.add(front.right);

                temp.add(front.val);

            }
            ans.add(temp);
        }
    }
}