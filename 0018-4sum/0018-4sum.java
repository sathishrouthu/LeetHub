class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int k = j+1,l=n-1;
                while(k<l){
                    long sum = nums[i]+nums[j];
                    sum += nums[k]+nums[l];
                    if(sum == target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        while(k<l && nums[k]==nums[k+1]) k++;
                        while(k<l && nums[l]==nums[l-1]) l--;
                        while(j<n-1 && nums[j]==nums[j+1]) j++;
                        while(i<n-1 && nums[i]==nums[i+1]) i++;
                        k++;
                        l--;
                    }
                    else if(sum<target)
                        k++;
                    else
                        l--;
                }
            }
        }
        return result;
    }
}