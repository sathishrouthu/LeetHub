class Solution {
    public boolean isSpecial(char c){
        if(Character.isAlphabetic(c) || Character.isDigit(c) ) return false;
        return true;
    }
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<j){
            char Ci = s.charAt(i);
            char Cj = s.charAt(j);
            while(i<j && isSpecial(Ci) ){
                i++;
                Ci = s.charAt(i);
            }
            while(i<j && isSpecial(Cj)){
                j--;
                Cj = s.charAt(j);
            }
            Ci = Character.toLowerCase(Ci);
            Cj = Character.toLowerCase(Cj);
            if(Ci!=Cj) return false;
            i++;
            j--;
        }
        return true;
    }
}