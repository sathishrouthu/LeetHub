class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]%2==0){
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
                i++;
            }
            j++;
        }
        return nums;
    }
}