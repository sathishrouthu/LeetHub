class Solution {
    public int longestSubarray(int[] arr) {
        int n = arr.length;
        int i=0,j=0,count=0;
        while(j<n){
            if(arr[j]==0) count++;
            if(count>1){
                if(arr[i]==0) count--;
                i++;
            }
            j++;
        }
        return j-i-1;
    }
}