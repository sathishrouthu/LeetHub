class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod = (int)1e9+7;
        Arrays.sort(nums);
        int n = nums.length;
        int[] pow = new int[n];
        pow[0] = 1;
        for(int i=1;i<n;i++)
            pow[i] = pow[i-1]*2%mod;
        int j=0;
        int count = 0;
        for(int i=0;i<n;i++){
            j=i;
            while(j<n && nums[i]+nums[j]<=target){
                j++;
            }
            if(j>i)
                count = ( count + pow[j-i-1] )%mod;
        }
        return count;
    }
}