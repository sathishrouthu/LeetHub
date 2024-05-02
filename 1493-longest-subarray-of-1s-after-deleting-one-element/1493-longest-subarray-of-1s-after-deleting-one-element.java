class Solution {
    public int longestSubarray(int[] arr) {
        int n = arr.length;
        int result = 0;
        int i=0,j=0,count=0;
        while(j<n){
            if(arr[j]==0) count++;
            while(count>1){
                if(arr[i]==0) count--;
                i++;
            }
            result = Math.max(result,j-i);
            j++;
        }
        return result;
    }
}