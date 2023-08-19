class Solution {
    int daysRequired(int[] weights,int cap){
        int n = weights.length;
        int load = 0;
        int days=1;
        for(int i=0;i<n;i++){
            if(load+weights[i]>cap){
                days++;
                load = weights[i];
            }
            else
                load+=weights[i];
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        // System.out.println(daysRequired(weights,10));
        int l = weights[0];
        int h = 0;
        for(int i:weights){
            l = Math.max(i,l);
            h+=i;
        }
        while(l<=h){
            int mid = (l+h)>>1;
            int d = daysRequired(weights,mid);
            if(d<=days) h=mid-1;
            else l=mid+1;
        }
        return l;
    }
}


// System.out.println()

/*

1 2 3 4 5 6 7 8 9
d=2
c=10;

*/