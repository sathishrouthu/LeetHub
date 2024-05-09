class Solution {
    private int countSplits(int[] nums,int maxSum){
        int currentSum  = 0;
        int count = 1;
        for(int i : nums){
            currentSum += i;
            if(currentSum > maxSum){
                count++;
                currentSum = i;
            }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int maxValue = nums[0];
        int totalSum = 0;
        for(int x : nums){
            maxValue = Math.max(x,maxValue);
            totalSum += x;
        }
        int l = maxValue;
        int h = totalSum;
        while(l<=h){
            int mid = (l+h)>>1;
            int splits = countSplits(nums,mid);
            if(splits > k){
                l=mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return l;
    }
}