class Solution {
    private int f(int i,int[] cost,int[] dp){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int one = f(i+1,cost,dp);
        int two = f(i+2,cost,dp);
        return dp[i] = cost[i]+Math.min(one,two);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(f(0,cost,dp),f(1,cost,dp));
    }
}