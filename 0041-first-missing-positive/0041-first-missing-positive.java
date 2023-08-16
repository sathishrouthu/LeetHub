class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
            mp.put(nums[i],i);
        for(int i=1;i<=n;i++){
            if(mp.containsKey(i)!=true) return i;
        }
        return n+1;
    }
}