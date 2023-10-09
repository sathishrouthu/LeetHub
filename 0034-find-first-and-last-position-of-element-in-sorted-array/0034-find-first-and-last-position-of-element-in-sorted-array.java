class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1,last=-1;
        int l=0,h=nums.length-1;
        while(l<=h){
            int mid = (l+h)>>1;
            if(nums[mid]==target){
                first=mid;
                h=mid-1;
            }
            else if(nums[mid]>target) h=mid-1;
            else l=mid+1;
        }
        l=0;
        h=nums.length-1;
        while(l<=h){
            int mid = (l+h)>>1;
            if(nums[mid]==target){
                last=mid;
                l=mid+1;
            }
            else if(nums[mid]>target) h=mid-1;
            else l=mid+1;
        }
        int[] ans={first,last};
        return ans;
    }
}