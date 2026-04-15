class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();

        findCombination(1, n, new ArrayList<Integer>(), k, res);
        return res;
    }
    private static void findCombination(int curr, int n,
        ArrayList<Integer> ds, int k, List<List<Integer>> res) 
        {
            if(n == 0 && k == 0) {
                res.add(new ArrayList<Integer>(ds));
                return;
            }
            for(int i = curr; i <= 9; i++) {
                if(k == 0 || n < 0) return;
                ds.add(i);
                findCombination(i + 1, n - i, ds, k - 1, res);
                ds.remove(ds.size() - 1);
            }
        }
}