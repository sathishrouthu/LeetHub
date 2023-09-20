class Solution {
    int f(int i, int j, int[] nums,int x,int op){
        if(x==0) return op;
        if(i>j || x<0) return -1;
        int left = f(i+1,j,nums,x-nums[i],op+1);
        int right = f(i,j-1,nums,x-nums[j],op+1);
        if(left==-1) return right;
        if(right == -1) return left;
        return Math.min(left,right);
        
    }
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int arrSum = 0;
        for(int i : nums) arrSum += i;
        int target = arrSum - x;
        int sub=0;
        int i=0;
        int sum = 0;
        int start = 0;
        while(i<n){
            sum += nums[i];
            while(start<n && sum>target){
                sum -= nums[start];
                start++;
            }
            if(sum==target)
                sub = Math.max(i-start+1,sub);
            i++;
        }
        if(target==0) return n;
        if(sub==0) return -1;
        return n-sub;
    }
}