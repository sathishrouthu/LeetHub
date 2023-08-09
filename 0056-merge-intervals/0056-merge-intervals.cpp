class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& arr) {
        vector<vector<int>> ans;
        sort(arr.begin(),arr.end());
        for(int i=0;i<arr.size();i++){
            vector<int> curr = arr[i];
            if(!ans.empty()) if(ans[ans.size()-1][1]>=curr[1]) continue;
            for(int j = i+1;j<arr.size();j++){
                if(curr[1]>=arr[j][0])
                    curr[1] = max(curr[1],arr[j][1]);
                else break;
            }
            ans.push_back(curr);
        }
        return ans;
    }
};