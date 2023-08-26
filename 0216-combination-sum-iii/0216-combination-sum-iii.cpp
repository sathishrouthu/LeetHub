class Solution {
public:
    void f(int i,int k,int n,vector<int>& ds,vector<vector<int>>& ans){
        if(n==0){
            if(ds.size()==k)
                ans.push_back(ds);
            return;
        }
        if(i<1) return;
        if(i<=n){
            ds.push_back(i);
            // cout<<"picking "<<i<<"n= "<<n<<"\n";
            f(i-1,k,n-i,ds,ans);
            ds.pop_back();
        }
        // cout<<" "<<i<<"n= "<<n<<"\n";
        f(i-1,k,n,ds,ans);
    }
    vector<vector<int>> combinationSum3(int k, int n) {
        vector<int> ds;
        vector<vector<int>> ans;
        f(9,k,n,ds,ans);
        return ans;
    }
};