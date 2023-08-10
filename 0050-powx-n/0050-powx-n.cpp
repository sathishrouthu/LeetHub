class Solution {
public:
    double myPow(double x, int n) {
        long nn = n;
        double ans = 1.0;
        if(nn<0) nn = nn*-1;
        while(nn){
            if(nn%2==0){
                x = x*x;
                nn = nn/2;
            }
            else{
                ans = ans*x;
                nn -=1;
            }
        }
        if(n<0) return (double)(1.0)/ans;
        return ans;
    }
};