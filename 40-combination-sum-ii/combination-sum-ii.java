class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> subArr = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);
        getList(candidates, 0, candidates.length, target, subArr, res);
        return res;
    }

    static void getList(int[] arr, int curr, int n, int target, List<Integer> subArr, List<List<Integer>> res) {
        if(target == 0) {
            res.add(new ArrayList<Integer>(subArr));
            return;
        }
        if(target < 0) return;

        for(int i = curr; i < arr.length; i++) {
            if(i > curr && arr[i] == arr[i - 1]) continue;
            
            if(arr[i] > target) break;
            subArr.add(arr[i]);
            getList(arr, i + 1, n, target - arr[i],subArr , res);
            subArr.remove(subArr.size() - 1);
        }
        
    }
}