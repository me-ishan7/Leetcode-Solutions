class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {

        // Both nodes are null
        if(root1 == null && root2 == null) {
            return true;
        }

        // One node is null
        if(root1 == null || root2 == null) {
            return false;
        }

        // Values must match
        if(root1.val != root2.val) {
            return false;
        }

        // Check both possibilities
        boolean noFlip = flipEquiv(root1.left, root2.left) &&
                         flipEquiv(root1.right, root2.right);

        boolean flip = flipEquiv(root1.left, root2.right) &&
                       flipEquiv(root1.right, root2.left);

        return noFlip || flip;
    }
}