class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum = 0;
        int i=0,j=0;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans=0;
        while(j<n){
            sum += nums[j];
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()<(j-i+1)){
                sum -= nums[i];
                if(map.get(nums[i])==1) 
                    map.remove(nums[i]);
                else 
                    map.put(nums[i],map.get(nums[i])-1);
                i++;
            }
            ans = Math.max(ans,sum);
            j++;
        }
        return ans;
    }
}