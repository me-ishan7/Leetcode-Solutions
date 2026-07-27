class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n = firstList.length;
        int m = secondList.length;

        if(n == 0 || m == 0) {
            return new int[][]{};
        }

        int i = 0, j = 0;

        List<int[]> ansList = new ArrayList<>();

        while(i < n && j < m) {
            int start1 = firstList[i][0];
            int end1 = firstList[i][1];
            int start2 = secondList[j][0];
            int end2 = secondList[j][1];

            if(start1 <= start2) {
                if(end1 >= start2) {
                    int start = Math.max(start1, start2);
                    int end = Math.min(end1, end2);

                    ansList.add(new int[]{start, end});
                }
            }
            else{
                if(end2 >= start1) {
                    int start = Math.max(start1, start2);
                    int end = Math.min(end1, end2);

                    ansList.add(new int[]{start, end});
                }
            }

            if(end1 <= end2) i++;
            else j++;
        }
        int[][] ans = new int[ansList.size()][2];

        for(i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }

        return ans;
    }
}