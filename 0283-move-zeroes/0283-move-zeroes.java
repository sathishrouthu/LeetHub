class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length && nums[i]!=0){
            i++;
            j++;
        }
        j++;
        while(j<nums.length){
            if(nums[j]!=0){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
            }
            j++;
        }
    }
}