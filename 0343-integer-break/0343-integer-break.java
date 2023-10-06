class Solution {
    // private int f(int n,int[] dp){
    //     if(n<=3) return n;
    //     if(dp[n]!=-1) return dp[n];
    //     int ans = n;
    //     for(int i=2;i<=n;i++){
    //         ans = Math.max(ans,i*f(n-i,dp));
    //     }
    //     return dp[n]=ans;
    // }
    public int integerBreak(int n) {
        if(n<=3) return n-1;
        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int num=4;num<=n;num++){
            dp[num]=num;
            for(int j=2;j<=num;j++){
                dp[num]=Math.max(dp[num],j*dp[num-j]);
            }
        }
        return dp[n];
    }
}