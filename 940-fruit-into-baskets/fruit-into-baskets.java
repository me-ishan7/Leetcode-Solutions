class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int FruitIntoBaskets = 1;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int right = 0; right < n; right++) {
            // Include right
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // Process left based on the condition - I've to store same type of fruit in 2 distinct baskets that's why map.size() > 2 used here
            while(map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if(map.get(fruits[left]) == 0) map.remove(fruits[left]);
                left++;
            }

            //store result
            if(map.size() <= 2){
                FruitIntoBaskets = Math.max(FruitIntoBaskets, right - left + 1);
            }

        }
    return FruitIntoBaskets;
    }
}