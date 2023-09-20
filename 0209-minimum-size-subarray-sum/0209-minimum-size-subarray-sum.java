class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = 0;
        int sum = 0;
        int minLength = n+1;
        
        while(end<n){
            sum+=nums[end];
            while(sum>=target){
                minLength = Math.min(end+1-start,minLength);
                sum-=nums[start++];
            }
            end++;
        }
        if(minLength == n+1) return 0;
        return minLength;
    }
}