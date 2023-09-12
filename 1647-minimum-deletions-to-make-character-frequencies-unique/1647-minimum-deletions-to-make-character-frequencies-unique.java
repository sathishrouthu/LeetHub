class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        int del = 0;
        for(int i=24;( i>=0 && freq[i]!=0);i--){
            // if(freq[i]==0) break;
            if(freq[i]>=freq[i+1]){
                int prev = freq[i];
                freq[i]=Math.max(0,freq[i+1]-1);
                del += prev - freq[i];
            }
        }
        return del;
    }
}