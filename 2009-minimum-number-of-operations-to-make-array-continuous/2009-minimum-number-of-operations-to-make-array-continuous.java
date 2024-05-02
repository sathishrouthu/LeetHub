class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] uniqueArr = new int[n];
        int idx=0;
        for(int i =0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            uniqueArr[idx++] = nums[i];
        }
        int uniqueLen = idx;
        
        int ans = n;
        for(int i=0;i<uniqueLen;i++){
            int left = uniqueArr[i];
            int right = left+n-1;
            int upperBound = upperBound(uniqueArr,uniqueLen,right);
            int existingElements = upperBound-i;
            int requiredOperations =n-existingElements;
            ans = Math.min(ans,requiredOperations);
        }
        return ans;
    }
    public int upperBound(int[] arr,int n,int k){
        int l = 0;
        int h = n-1;
        while(l<=h){
            int mid = (l+h)>>1;
            if(arr[mid]<=k) l=mid+1;
            else h=mid-1;
        }
        return l;
    }
}