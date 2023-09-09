class Solution {
    int f(int[] nums,int target,int[] dp){
        if(target==0) return 1;
        if(dp[target]!=-1) return dp[target];
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=target)
                res+=f(nums,target-nums[i],dp);
        }
        return dp[target] = res;
    }
    public int combinationSum4(int[] nums, int target) {
        
        int[] dp = new int[target+1];
        for(int i=0;i<=target;i++) dp[i]=-1;
        return f(nums,target,dp);
    }
}