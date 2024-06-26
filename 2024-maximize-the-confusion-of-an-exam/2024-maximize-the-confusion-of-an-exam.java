class Solution {
    public int maxConsecutiveAnswers(String str, int k) {
        // int ans = 0;
        int i=0,j=0;
        int countTrue  = 0;
        int countFalse = 0;
        while(j<str.length()){
            if(str.charAt(j)=='T') countTrue++;
            else countFalse++;
            int maxRepeated = Math.max(countTrue,countFalse);
            if((j-i+1) - maxRepeated > k){
                if(str.charAt(i)=='T') countTrue--;
                else countFalse--;
                i++;
            }
            // ans = Math.max(ans,j-i+1);
            j++;
        }
        return j-i;
    }
}