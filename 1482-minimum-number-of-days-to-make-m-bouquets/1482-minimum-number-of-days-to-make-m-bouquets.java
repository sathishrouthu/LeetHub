class Solution {
    int bouquetsInXDays(int[] arr,int k,int x){
        int bouquets = 0;
        int count = 0;
        for(int i : arr){
            if(i <= x) count++;
            if(count==k){
                bouquets++;
                count=0;
            }
            if(i > x) count=0;
        }
        return bouquets;
    }
    
    public int minDays(int[] bloomDay, int m, int k) {
        int  l=1,h=bloomDay[0];
        for(int x : bloomDay) h = Math.max(x,h);
        int maxi = h;
        while(l<=h){
            int mid = (l+h)>>1;
            int bouquets = bouquetsInXDays(bloomDay,k,mid);
            if(bouquets >= m)
                h = mid-1;
            else
                l = mid+1;
        }
        if(l>maxi) return -1;
        return l;
    }
}