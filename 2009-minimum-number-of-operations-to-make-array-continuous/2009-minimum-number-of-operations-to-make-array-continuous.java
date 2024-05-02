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
        int j = 0;
        for(int i=0;i<uniqueLen;i++){
            int left = uniqueArr[i];
            int right = left+n-1;
            while(j<uniqueLen && uniqueArr[j]<=right) j++;
            int existingElements = j-i;
            int requiredOperations =n-existingElements;
            ans = Math.min(ans,requiredOperations);
        }
        return ans;
    }
}