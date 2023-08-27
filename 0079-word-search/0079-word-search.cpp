class Solution {
public:
    bool f(int i,int r,int c,int m,int n, vector<vector<char>>& board, string word){
        if(i==word.length()) return true;
        if(r<0 || c<0 || r==m || c==n || board[r][c]=='$' || board[r][c]!=word[i]) 
            return false;
        char ch = board[r][c];
        board[r][c] = '$';
        bool top = f(i+1,r-1,c,m,n,board,word);
        bool bottom = f(i+1,r+1,c,m,n,board,word);
        bool left = f(i+1,r,c-1,m,n,board,word);
        bool right = f(i+1,r,c+1,m,n,board,word);
        board[r][c]=ch;
        return top||bottom||left||right;
    }
    
    bool exist(vector<vector<char>>& board, string word) {
        int m = board.size();
        int n = board[0].size();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word[0]){
                    if(f(0,i,j,m,n,board,word))
                        return true;
                }
            }
        }
        return false;
    }
};