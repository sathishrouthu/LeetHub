class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i=0,j=0;
        int sum=0;
        int n = nums.length;
        int count=0;
        int leadingZeros = 0;
        while(j<n){
            sum += nums[j];
            while(i<j && (nums[i]==0 || sum>goal)){
                if(nums[i]==1){
                    leadingZeros=0;
                }else{
                    leadingZeros++;
                }
                
                sum-=nums[i];
                i++;
            }
            if(sum==goal)
                count += 1+leadingZeros;
            j++;
        }
        return count;
    }
}