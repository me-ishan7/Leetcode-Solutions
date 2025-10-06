class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int res = 0;
        int[] prefixArray = new int[n];
        int[] suffixArray = new int[n];
        prefixArray[0] = height[0];
        suffixArray[n - 1] = height[n - 1];

        for(int i = 1; i < n; i++) {
            prefixArray[i] = Math.max(height[i], prefixArray[i - 1]);
            }
    
        for (int i = n - 2 ; i >= 0; i--) {
            suffixArray[i] = Math.max(height[i],suffixArray[i + 1]);
        }

        for(int i = 0; i < n; i++) {
            res += Math.min(prefixArray[i], suffixArray[i]) - height[i];
        }
        return res;
    }
}