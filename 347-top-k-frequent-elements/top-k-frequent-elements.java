class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int count = 0; 
        int n = nums.length;
        int[] ans = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> list = 
            new ArrayList<>(map.entrySet());

        list.sort(
            (a, b) -> (
                
                    b.getValue() -  
                    a.getValue()
                    )
                
        );

        for(int i = 0; i < k; i++){
            ans[i] = list.get(i).getKey();
        }

        return ans;
    }
}