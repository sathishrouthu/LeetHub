class Solution {
    static int countSetBits(int n){
        int ans = 0;
        while(n>0){
            ans += n&1;
            n /= 2;
        }
        return ans;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i] = countSetBits(i);
        }
        return ans;
    }
}