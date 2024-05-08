class Solution {
    int hoursNeededAtSpeedX(int[] piles,int x){
        int hours = 0;
        for(int i : piles){
            hours += Math.ceil((double)i/(double)x);
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = piles[0];
        for(int i : piles) r = Math.max(r,i);
        while(l<=r){
            int mid = (l+r)>>1;
            int hoursNeeded = hoursNeededAtSpeedX(piles,mid);
            if(hoursNeeded <= h){
                r=mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
}