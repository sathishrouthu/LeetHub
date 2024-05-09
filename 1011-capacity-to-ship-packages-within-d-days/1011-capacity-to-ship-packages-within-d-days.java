class Solution {
    int daysRequired(int[] weights,int capacity){
        int count = 1;
        int load = 0;
        for(int w : weights){
            load += w;
            if(load > capacity){
                count++;
                load = w;
            }
        }
        return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxCapacity = 0;
        int maxWeight = weights[0];
        for(int i:weights) {
            maxWeight = Math.max(maxWeight,i);
            maxCapacity += i;
        }
        if(days == 1) 
            return maxCapacity;
        int l = maxWeight,h=maxCapacity;
        while(l<=h){
            int mid = (l+h)>>1;
            int daysRequired = daysRequired(weights,mid);
            if(daysRequired > days){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return l;
    }
}