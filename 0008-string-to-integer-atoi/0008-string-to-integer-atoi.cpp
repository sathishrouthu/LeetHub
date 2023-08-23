class Solution {
public:
    int myAtoi(string s) {
        int n = s.size();
        int i = 0;
        while(i<n && s[i]==' ') i++;
        char sign='+';
        if(i<n && s[i]=='-'||s[i]=='+'){
            sign = s[i];
            i++;
        }
        int result = 0;
        cout<<i;
        while(i<n and isDigit(s[i])){
            int digit = s[i]-'0';
            if( result> (INT_MAX-digit)/10 ) return sign=='+'?INT_MAX:INT_MIN;
            result = result*10+digit;
            i++;
        }
        return sign=='+'?result:-result;
    }
    bool isDigit(char c){
        return '0'<=c && c<='9';
    }
};