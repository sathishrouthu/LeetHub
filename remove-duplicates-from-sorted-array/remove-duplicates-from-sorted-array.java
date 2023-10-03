class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;
        int j=1;
        while(j<n){
            if(nums[j]!=nums[i]){
                i++;
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
            j++;
        }
        return i+1;
    }
}