class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid = (l+h)>>1;
            int missing = arr[mid]-(mid+1);
            if(k<=missing) h=mid-1;
            else l=mid+1;
        }
        return k+h+1;
    }
}