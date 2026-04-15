// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        findSum(arr, 0, arr.length, 0, ans);
        return ans;
    }
    
    static void findSum(int[] arr, int curr, int n,int sum, ArrayList<Integer> ans) {
        
        if(curr >= n && sum >= 0) {
            ans.add(sum);
            return;
        }
        sum += arr[curr];
        findSum(arr, curr + 1, n, sum, ans);
        sum -= arr[curr];
        findSum(arr, curr + 1, n, sum, ans);
        
    }
}