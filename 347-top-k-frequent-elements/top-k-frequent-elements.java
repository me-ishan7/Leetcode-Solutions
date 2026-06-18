class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int count = 0; 
        int n = nums.length;
        int[] ans = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        Queue<Integer> minHeap = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        for(int key : map.keySet()){
            minHeap.add(key);

            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        while(k-- > 0){
            ans[k] = minHeap.poll();
        }

        return ans;
    }
}