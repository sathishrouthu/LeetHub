class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 1, h = 1;
        int n = nums.length;
        while(h<n){
            while(h<nums.length && nums[h]==nums[h-1])
                h++;
            if(h<n){
                nums[l]=nums[h];
                l++;
            }
            h++;
        }
        return l;
    }
}