class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> pool = new HashSet<>();
        for(int i:nums)
            pool.add(i);
        int ans = 0;
        for(Integer i : pool){
            if(pool.contains(i-1)) continue;
            int cnt =1;
            while(pool.contains(++i)) cnt++;
            ans = Math.max(cnt,ans);
        }
        return ans;
    }
}