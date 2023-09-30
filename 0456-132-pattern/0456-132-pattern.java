class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int second = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<second) return true;
            while(!stack.empty() && stack.peek() < nums[i]){
                second = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}

/*

        int n = nums.length;
        int arr[] = new int[n];
        arr[0] = nums[0];
        for(int i=1;i<n;i++)
            arr[i] = Math.min(arr[i-1],nums[i-1]);
        int top = n;
        for(int i=n-1;i>1;i--){
            if(nums[i]>arr[i]){
                while(top<n && arr[top]<=arr[i]) top--;
                if(top<n && arr[top]<nums[i]) return true;
            } 
            top--;
            arr[top] = nums[i];
        }
        return false;

*/