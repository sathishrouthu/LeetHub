class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum==target){
                int[] ans = {i+1,j+1};
                return ans;
            }
            if(sum<target)
                i++;
            else
                j--;
        }
        return new int[0];
    }
}