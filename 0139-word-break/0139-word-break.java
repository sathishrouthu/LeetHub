class Solution {
    boolean f(int i,String s,List<String> wordDict,int[] dp){
        if(i>=s.length()) return true;
        if(dp[i]!=-1) return dp[i]==1;
        boolean flag = false;
        for(int j=i+1;j<=s.length();j++){
            if(wordDict.contains(s.substring(i,j))){
                // System.out.println(i+"  "+j+"\n");
                flag = flag || f(j,s,wordDict,dp);
            }
        }
        dp[i] = flag?1:0;
        return flag;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return f(0,s,wordDict,dp);        
    }
}