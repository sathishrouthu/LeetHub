class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 1;
        int x = nums[0];
        for(int i=1;i<n;i++){
            if(cnt==0){
                x = nums[i];
            }
            if(nums[i]==x)
                cnt++;
            else
                cnt--;
        }
        return x;
    }
}