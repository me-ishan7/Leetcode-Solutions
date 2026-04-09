class Solution {
    static void printTillN(int N) {
        // code here
        if(N == 1) {
            System.out.print(N + " ");
            return;
        }
        else{
           printTillN(N - 1);
           System.out.print(N+ " ");
        }
        
    }
}