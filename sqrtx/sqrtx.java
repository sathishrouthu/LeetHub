class Solution {
    public int mySqrt(int x) {
        int l=1;
        int h=x;
        while(l<=h){
            int mid = (l+h)>>1;
            if(mid<=x/mid) l = mid+1;
            else h=mid-1;
        }
        return h;
    }
}