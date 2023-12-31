class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int h = nums.length-1;
        while(l<=h){
            int mid = (l+h)>>1;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target)    l=mid+1;
            else h = mid-1;
        }
        return l;
    }
}