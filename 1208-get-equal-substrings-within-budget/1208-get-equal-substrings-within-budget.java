class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int ans = 0;
        int i=0,j=0;
        int cost=0;
        while(j<n){
            cost += Math.abs(s.charAt(j) - t.charAt(j));
            while(cost > maxCost){
                cost -= Math.abs(s.charAt(i)-t.charAt(i));
                i++;
            }
            ans = Math.max(j-i+1,ans);
            j++;
        }
        return ans;
    }
}