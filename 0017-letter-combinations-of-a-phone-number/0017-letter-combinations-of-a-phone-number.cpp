class Solution {
public:
    void f(int ind,string digits,map<char,string>& mp,string curr,vector<string>& ans){
        if(ind==digits.size()){
            ans.push_back(curr);
            return;
        }
        char c = digits[ind];
        for(int i=0;i<mp[c].size();i++){
            curr+=mp[c][i];
            f(ind+1,digits,mp,curr,ans);
            curr.pop_back();
        }
    }
    vector<string> letterCombinations(string digits) {
        if(digits.size()==0) return {};
        map<char,string> mp;
        mp['2']="abc";
        mp['3']="def";
        mp['4']="ghi";
        mp['5']="jkl";
        mp['6']="mno";
        mp['7']="pqrs";
        mp['8']="tuv";
        mp['9']="wxyz";
        vector<string> ans;
        string curr;
        f(0,digits,mp,curr,ans);
        return ans;
    }
};