class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0,end=0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(sb.charAt(i)==' ' || i==n-1){
                end = i-1;
                if(i==n-1) end++;
                while(start<end){
                    char c = sb.charAt(start);
                    sb.setCharAt(start,sb.charAt(end));
                    sb.setCharAt(end,c);
                    start++;
                    end--;
                }
                start = i+1;
            }
            
        }
        return sb.toString();
    }
}

/*

abc def ghi

*/
