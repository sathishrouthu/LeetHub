class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] newArr = new int[n];
        int idx=0;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            newArr[idx++]=nums[i];
        }
        int newArrLen = idx;
        System.out.println(idx);
        int ans=n;
        int j=0;
        for(int i=0;i<newArrLen;i++){
            int left = newArr[i];
            int right = left+n-1;
            while(j<newArrLen && newArr[j]<=right) j++;
            int existingElements = j-i;
            ans = Math.min(ans,n-existingElements);
        }
        return ans;
    }
    private int upperBound(int[] arr,int k,int n){
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