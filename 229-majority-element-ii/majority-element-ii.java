class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int size = nums.length;
        int mini = (int)(size / 3) + 1;
        for(int num : nums) {
            map.put(num , map.getOrDefault(num , 0) + 1);
            if(map.get(num) == mini){
                list.add(num);
            }
        }
        return list;
    }
}