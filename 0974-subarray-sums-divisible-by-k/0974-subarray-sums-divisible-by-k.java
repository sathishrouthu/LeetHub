class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        int[] rem = new int[k];
        for(int i = 0;i<nums.length;i++){
            prefixSum+=nums[i];
            rem[((prefixSum%k)+k)%k]++;
        }
        for(int r : rem){
            if(r>1){
                count += (r*(r-1))/2;
            }
        }
        count+=rem[0];
        return count;
    }
}