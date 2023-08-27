class Solution {
public:
    bool isPal(string s,int i,int j){
        while(i<j){
            if(s[i]!=s[j]) return false;
            i++;
            j--;
        }
        return true;
    }
    void f(int i,string s,vector<string> &parts,vector<vector<string>> &ans){
        if(i==s.size()){
            ans.push_back(parts);
            return;
        }
        for(int j=i;j<s.size();j++){
            if(isPal(s,i,j)){
                parts.push_back(s.substr(i,j-i+1));
                f(j+1,s,parts,ans);
                parts.pop_back();
            }
        }
    }
    vector<vector<string>> partition(string s) {
        vector<vector<string>> ans;
        vector<string> parts;
        f(0,s,parts,ans);
        return ans;
    }
};