class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubarrayWithAtMostSumK(nums,goal)-numSubarrayWithAtMostSumK(nums,goal-1);
    }
    public int numSubarrayWithAtMostSumK(int[] nums, int k){
        int n = nums.length;
        int i = 0,j=0;
        int sum=0;
        int count = 0;
        for(;j<n;j++){
            sum+= nums[j];
            while(i<=j && sum>k){
                sum-=nums[i++];
            }
            count += j-i+1;
        }
        return count;
    }
}