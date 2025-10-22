class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        HashSet<Integer> set = new HashSet<>();

        // Adding Element in the Set 
        for(int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int maxLen = 0;
        // Iterating in the Set
        for(Integer element : set) {
            int prevEl = element - 1;
            if(!set.contains(prevEl)){
                int nextEl = element + 1;
                int len = 1;
                // Counting Sequence
                while(set.contains(nextEl)){
                    len++;
                    nextEl++;
                }
                maxLen = Math.max(len,maxLen);
            }      
        }
        return maxLen;  
    }
}
        
