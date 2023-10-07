class Solution {
    int MOD =(int)1e9+7;
    int f(int i,int maxi,int remain,int n,int m,int dp[][][]){
        if(i==n){
            if(remain==0) return 1;
            return 0;
        }
        
        if(remain<0) return 0;
        
        if(dp[i][maxi][remain]!=-1)  return dp[i][maxi][remain];
        
        int ans = 0;
        
        for(int j=1;j<=maxi;j++){
            ans = (ans+f(i+1,maxi,remain,n,m,dp))%MOD;
        }
        
        for(int j=maxi+1;j<=m;j++){
            ans = (ans+f(i+1,j,remain-1,n,m,dp))%MOD;
        }
        return dp[i][maxi][remain] = ans;
    }
    public int numOfArrays(int n, int m, int k) {
        int[][][] dp = new int[n+1][m+1][k+1];
        
        for(int i=0;i<=m;i++){
            dp[n][i][0]=1;
        }
        
        for(int i=n-1;i>=0;i--){
            for(int maxi=m;maxi>=0;maxi--){
                for(int remain = 0;remain<=k;remain++){
                    
                    //==========
                    
                    int ans = 0;
                    
                    for(int j=1;j<=maxi;j++){
                        ans = (ans+dp[i+1][maxi][remain])%MOD;
                    }
                    if(remain>0){
                        for(int j=maxi+1;j<=m;j++){
                            ans = (ans+dp[i+1][j][remain-1])%MOD;
                        }
                    }
                    dp[i][maxi][remain] = ans;
                    
                    //==========
                    
                }
            }
        }
        return dp[0][0][k];
    }
}