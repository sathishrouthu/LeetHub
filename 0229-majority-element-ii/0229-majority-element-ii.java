class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int x1=Integer.MIN_VALUE;
        int x2=Integer.MIN_VALUE;
        int c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(c1==0 && nums[i]!=x2){
                x1=nums[i];
                c1=1;
            }
            else if(c2==0 && nums[i]!=x1){
                x2=nums[i];
                c2=1;
            }
            else if(nums[i]==x1) c1++;
            else if(nums[i]==x2) c2++;
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x1) c1++;
            if(nums[i]==x2) c2++;
        }
        int min = (int)(n/3)+1;
        List<Integer> ans = new ArrayList<>();
        if(c1 >=min) ans.add(x1);
        if(c2 >=min) ans.add(x2);
        return ans;
    }
}