class Solution {
public:
    int countSplits(vector<int>& nums,int maxSum){
        int n = nums.size();
        int count=1;
        int currSum = nums[0];
        for(int i=1;i<n;i++){
            if(currSum+nums[i]<=maxSum)
                currSum+=nums[i];
            else{
                count++;
                currSum = nums[i];
            }
        }
        return count;
    }
    int splitArray(vector<int>& nums, int k) {
        int n = nums.size();
        int l = *max_element(nums.begin(),nums.end());
        int h = accumulate(nums.begin(),nums.end(),0);
        while(l<=h){
            int mid = (l+h)>>1;
            int splits = countSplits(nums,mid);
            if(splits<=k)    h = mid-1;
            else l = mid+1;
        }
        return l;
    }
};