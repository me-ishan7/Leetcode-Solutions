import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {

        int count = 0;
        int sum = 0;

        // HashMap to store frequency of each prefix sum encountered so far
        HashMap<Integer, Integer> map = new HashMap<>();

        // Initialize with sum = 0 having frequency = 1
        // This handles cases where a subarray from index 0 to i itself sums to k
        map.put(0, 1);

        // Traverse the array
        for (int num : nums) {
            // Update the running sum
            sum += num;

            // Check if there exists a prefix sum (sum - k)
            // If yes, then there are 'map.get(sum - k)' subarrays ending here that sum to k
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Update the frequency of the current prefix sum in the map
            // If already present, increment it; else, initialize it to 1
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        // Return the total count of subarrays with sum = k
        return count;
    }
}
