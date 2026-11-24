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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) 
            return new ArrayList<List<Integer>>();

        ans = new ArrayList<>();
        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while(!q.isEmpty()){

            List<Integer> temp = new ArrayList<>();
            int size = q.size();
            
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                if(curr.left != null) 
                    q.offer(curr.left);

                if(curr.right != null) 
                    q.offer(curr.right);

                temp.add(curr.val);
                
            }
            ans.add(temp);
        }

        int size = ans.size();

        List<List<Integer>> result = new ArrayList<>();

        for(int i = size - 1; i >= 0; i--) {
            result.add(ans.get(i));
        }
        return result;
    }
}