class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        sum(candidates, target, 0, candidates.length, ds, res);

        return res;

    }

    static void sum(int[] arr, int target, int curr, int n,       List<Integer> ds, List<List<Integer>> res) {

        if(target < 0 || curr == n) {
            return;
        }
        
        if(target == 0) {
            res.add(new ArrayList<Integer> (ds));
            return;
        }

        ds.add(arr[curr]);
        target -= arr[curr];

        sum(arr, target, curr, n, ds, res);

        ds.remove(ds.size() - 1);
        target += arr[curr];

        sum(arr, target, curr + 1, n, ds, res); 

    }
}