class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                count+=map.get(nums[i]);
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        return  count;
    }
}