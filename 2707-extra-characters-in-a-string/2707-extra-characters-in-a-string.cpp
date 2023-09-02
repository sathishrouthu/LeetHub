class Solution {
public:
    int f(int start,string s,int n, vector<string>& dictionary,unordered_map<string,int>& mp,vector<int> &dp){
        if(dp[start]!=-1) return dp[start];
        if(start==n) return 0;
        int ans = 1+f(start+1,s,n,dictionary,mp,dp);
        
        for(int end = start;end<n;end++){
            if(mp.find(s.substr(start,end-start+1))!=mp.end()){
                ans = min(ans,f(end+1,s,n,dictionary,mp,dp));
            }
        }
        return dp[start] =ans;
    }
    int minExtraChar(string s, vector<string>& dictionary) {
        int n = s.size();
        vector<int> dp(n+1,-1);
        unordered_map<string,int> mp;
        for(string s : dictionary)
            mp[s]++;
        return f(0,s,n,dictionary,mp,dp);
        
    }
};