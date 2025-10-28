class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int candidate1 = Integer.MIN_VALUE;
        int candidate2 = Integer.MIN_VALUE;
        int n = nums.length;
       
        for(int num : nums) {
            if(count1 == 0 && num != candidate2){
                candidate1 = num;
                count1 = 1;
            }
            else if(count2 == 0 && num != candidate1) {
                candidate2 = num;
                count2 = 1;
            }
            else if(num == candidate1) count1++;
            else if(num == candidate2) count2++;
            else{
                count1--;
                count2--;
            } 
            
        }
        List<Integer> list = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for(int num : nums) {
            if(candidate1 == num) count1++;
            if(candidate2 == num) count2++;
        }
        int mini = n / 3;
        if(count1 > mini) list.add(candidate1);
        if(count2 > mini) list.add(candidate2);
        
        return list;
    }
}