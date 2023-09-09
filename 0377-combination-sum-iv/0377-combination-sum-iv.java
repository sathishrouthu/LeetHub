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
        dp[0]=1;
        
        for(int t=0;t<=target;t++){
            int res = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=t)
                    res+=dp[t-nums[i]];
            }
            dp[t] += res;
        }
        return dp[target];
    }
}

