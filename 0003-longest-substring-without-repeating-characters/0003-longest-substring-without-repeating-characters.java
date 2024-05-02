class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int[] hash = new int[127];
        char[] str = s.toCharArray();
        int i=0,j=0;
        int count=0;
        int ans = 0;
        while(j<n){
            hash[str[j]]++;
            if(hash[str[j]]==1) count++;
            while(count<(j-i+1)){
                hash[str[i]]--;
                if(hash[str[i]]==0) count--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}