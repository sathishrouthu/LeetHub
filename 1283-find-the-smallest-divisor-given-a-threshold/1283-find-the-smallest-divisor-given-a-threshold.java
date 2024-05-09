class Solution {
    int getResult(int[] nums,int div){
        int result = 0;
        for(int i : nums){
            result += Math.ceil((double)i / (double)div);
        }
        return result;
    }
    
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1,h=nums[0];
        for(int i : nums){
            h = Math.max(i,h);
        }
        while(l<=h){
            int div = (l+h)>>1;
            int result = getResult(nums,div);
            if(result<=threshold){
                h = div-1;
            }
            else{
                l = div+1;
            }
        }
        return l;
    }
}