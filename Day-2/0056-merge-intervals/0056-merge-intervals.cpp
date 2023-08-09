class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& arr) {
        vector<vector<int>> ans;
        sort(arr.begin(),arr.end());
        ans.push_back(arr[0]);
        for(int i=1;i<arr.size();i++){
            int lastEnd = ans.back()[1];
            if(lastEnd>=arr[i][0])
                ans.back()[1]=max(lastEnd,arr[i][1]);
            else
                ans.push_back(arr[i]);
        }
        return ans;
    }
};