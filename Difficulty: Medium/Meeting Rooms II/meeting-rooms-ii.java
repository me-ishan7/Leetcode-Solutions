class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
       int n = start.length;
       if(n == 0) return 0;
       
       Arrays.sort(start);
       Arrays.sort(end);
       
       int room = 0;
       int maxRooms = Integer.MIN_VALUE;
       
       int i = 0, j = 0;
       
       while(i < n && j < n) {
           if(start[i] < end[j]) {
               room++;
               maxRooms = Math.max(maxRooms, room);
               i++;
           }
           else{
               room--;
               j++;
           }
       }
        return maxRooms == Integer.MIN_VALUE ? 0 : maxRooms;
    }
}
