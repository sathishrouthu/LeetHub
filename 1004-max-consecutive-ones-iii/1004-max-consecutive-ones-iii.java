class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j<nums.length){
            if(nums[j]==0) count++;
            if(count>k){
                if(nums[i]==0) count--;
                i++;
            }
            // ans = Math.max(ans,j-i+1);
            j++;
        }
        return j-i;
    }
}