class Solution {
    int getRemainSum(int[] nums,int divisor){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/(double)divisor);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int h=nums[0];
        for(int i:nums) h = Math.max(h,i);
        while(l<=h){
            int mid = (l+h)>>1;
            int remainder = getRemainSum(nums,mid);
            // System.out.println(remainder);
            if(remainder<=threshold) h=mid-1;
            else l=mid+1;
        }
        return l;
    }
}