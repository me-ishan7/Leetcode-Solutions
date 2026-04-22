class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int left = 0, right = 0;
        int prev = Integer.MIN_VALUE;
        
        while(left < a.length && right < b.length) 
        {
            if(a[left] < b[right]){
                if(list.isEmpty() || list.get(list.size() - 1) != a[left])
                    list.add(a[left]);
                left++;
            }
            else if(b[right] < a[left]) {
                if(list.isEmpty() || list.get(list.size() - 1) != b[right])
                    list.add(b[right]);
                right++;
            }
            else {
                if(list.isEmpty() || list.get(list.size() - 1) != a[left])
                    list.add(a[left]);
                    
                left++;
                right++;
               
            }
            
        }
        
        for(int i = left; i < a.length; i++) {
            if(list.isEmpty() || list.get(list.size() - 1) != a[i])
                list.add(a[i]);
        }
        for(int i = right; i < b.length; i++) {
            if(list.isEmpty() || list.get(list.size() - 1) != b[i])
                list.add(b[i]);
        }
        
        return list;
    }
}
