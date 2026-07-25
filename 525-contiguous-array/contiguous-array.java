class Solution {
    public int findMaxLength(int[] nums) {
        int oneCount = 0;
        int zeroCount = 0;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                zeroCount++;
            else 
                oneCount++;
            
            int currDiff = oneCount - zeroCount;

            if(currDiff == 0) {
                res = Math.max(res, i + 1);
            }

            if(map.containsKey(currDiff)){
                res = Math.max(res, i - map.get(currDiff));
            }
            else{
                map.put(currDiff, i);
            }
                
        }
        return res;
    }
}