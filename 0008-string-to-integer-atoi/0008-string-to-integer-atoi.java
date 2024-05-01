class Solution {
    public int myAtoi(String str) {
        int n = str.length();
        if(str.length()==0) return 0;
        int i = 0;
        while( i< n && str.charAt(i)==' ') i++;
        if(i==n) return 0;
        char sign = '+';
        if(  (str.charAt(i) == '+' || str.charAt(i)=='-')){
            sign  = str.charAt(i);
            i++;
        }
        char[] arr = str.toCharArray();
        int result = 0;
        while(i < arr.length && Character.isDigit(arr[i])){
            int digit = arr[i]-'0';
            if(result > (Integer.MAX_VALUE-digit)/10) 
                return sign=='-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            result = result*10+digit;
            i++;
        }
        return sign=='+' ? result : -result;
    }
}
