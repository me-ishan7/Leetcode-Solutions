class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>();

        boolean inserted = false;

        for (int i = 0; i < intervals.length; i++) {

            if (!inserted && newInterval[0] < intervals[i][0]) {
                list.add(newInterval);
                inserted = true;
            }

            list.add(intervals[i]);
        }

        if (!inserted)
            list.add(newInterval);

        return mergeIntervals(list);
    }

    private int[][] mergeIntervals(List<int[]> list) {

        int start1 = list.get(0)[0];
        int end1 = list.get(0)[1];

        List<int[]> ansList = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {

            int start2 = list.get(i)[0];
            int end2 = list.get(i)[1];

            if (end1 >= start2) {
                end1 = Math.max(end1, end2);
            } else {
                ansList.add(new int[]{start1, end1});

                start1 = start2;
                end1 = end2;
            }
        }

        ansList.add(new int[]{start1, end1});

        int[][] ans = new int[ansList.size()][2];

        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }

        return ans;
    }
}