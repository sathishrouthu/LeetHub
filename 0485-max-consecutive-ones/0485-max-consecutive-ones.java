class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,j=0;
        int maxi = 0;
        int n = nums.length;
        while(j<n){
            i=j;
            while(j<n && nums[j]==1)
                j++;
            maxi = Math.max(j-i,maxi);
            j++;
        }
        return maxi;
    }
}