class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        int i=0;
        int j=0;
        while(j<nums.size()){
            if(nums[j]%2==0){
                swap(nums[i],nums[j]);
                i++;
            }
            j++;
        }
        return nums;
    }
};
/*

4 5 6 3 4 2 3 4

i=0 1
j=0 1 2

4 6 5 3 4 2 3 4

i=2
j=3 4

4 6 4 3 5 2 3 4
i=3
j=5

4 6 4 2 4 3 3 5
i=4
j=6 7



    
    
    
    
*/