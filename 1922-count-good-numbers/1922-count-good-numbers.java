class Solution {
    long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long res = fastPow(4,n/2) % MOD;
        res = res * fastPow(5,(n+1)/2) % MOD;
        return (int)res;
    }
    
    long fastPow(long x, long y){
        long res = 1;     // Initialize result
  
        while (y > 0)
        {
            if ((y % 2) == 1){
                res = res * x;
                res = res % MOD;
                y--;
            }
            else{
                y = y / 2; 
                x = x * x ; 
                x = x % MOD;
            }
        }
        return res;
    }
}