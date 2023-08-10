class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        int n = nums.size();
        int c1=0,c2=0;
        
        int x1 = INT_MAX,x2 = INT_MAX;
        
        for(int i=0;i<n;i++){
            if(c1==0 && nums[i]!=x2){
                x1 = nums[i];
                c1=1;
            }
            else if(c2==0 && nums[i]!=x1){
                x2 = nums[i];
                c2=1;
            }
            else if(nums[i]==x1) c1++;
            else if(nums[i]==x2) c2++;
            else{
                c1--;
                c2--;
            }
        }
        int mini = int(n/3)+1;
        
        c1=0;c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==x1) c1++;
            if(nums[i]==x2) c2++;
        }
        if(c1>=mini && c2 >= mini)
            return {x1,x2};
        if(c1>=mini)
            return {x1};
        if(c2>=mini)
        return {x2};
        return {};
    }
};