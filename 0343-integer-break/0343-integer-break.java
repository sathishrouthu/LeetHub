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
        if(n%3==0) return (int) Math.pow(3,n/3);
        if(n%3==1) return (int) Math.pow(3,n/3 - 1)*4;
        return (int) Math.pow(3,n/3)*2;
    }
}