class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int start=0,end=n;
        int i=0,j=0;
        int[] freq = new int[52];
        for(char c : t.toCharArray()){
            if(c<'a') freq[c-'A']++;
            else freq[c-'a'+26]++;
        }
        int need = t.length();
        int idx;
        while(j<n){
            char Cj = s.charAt(j);
            idx = Cj<'a' ? Cj-'A': Cj-'a'+26;
            freq[idx]--;
            if(freq[idx]>=0) need--;
            while(need==0){
                if(j-i < end-start){
                    start=i;
                    end=j;
                }
                char Ci = s.charAt(i);
                idx = Ci<'a' ? Ci-'A': Ci-'a'+26;
                freq[idx]++;
                if(freq[idx]>0) need++;
                i++;
            }
            j++;
        }
        if(end==n) return "";
        return s.substring(start,end+1);
    }
}