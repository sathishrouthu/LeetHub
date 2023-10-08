class Solution {
    int f(int i,int j,int[] nums1, int[] nums2,int[][] dp){
        if(i==nums1.length || j==nums2.length) return 0;
        
        if(dp[i][j]!=0) return dp[i][j];
        
        int curr = nums1[i]*nums2[j] + f(i+1,j+1,nums1,nums2,dp);
        int nexti = f(i+1,j,nums1,nums2,dp);
        int nextj = f(i,j+1,nums1,nums2,dp);
        
        return dp[i][j] = Math.max(curr,Math.max(nexti,nextj));        
    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int max1 = nums1[0];
        int min1 = nums1[0];
        int max2 = nums2[0];
        int min2 = nums2[0];
        for(int i : nums1){
            max1 = Math.max(max1,i);
            min1 = Math.min(min1,i);
        }
        for(int i : nums2){
            max2 = Math.max(max2,i);
            min2 = Math.min(min2,i);
        }
        
        if(max1<0 && min2>0) return max1*min2;
        if(max2<0 && min1>0) return max2*min1;
        
        int[][] dp = new int[nums1.length][nums2.length];
        return f(0,0,nums1,nums2,dp);
    }
}