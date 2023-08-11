class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> mp;
        for(int i=0;i<nums.size();i++){
            int c = target - nums[i];
            if(mp.find(c)!=mp.end() && mp[c]!=i){
                return {i,mp[c]};
            }
            mp[nums[i]]=i;
        }
    return {-1,-1};
    }
};