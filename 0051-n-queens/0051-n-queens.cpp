class Solution {
public:
    bool isSafe(vector<string> board,int r,int c,int n){
        int row = r;
        int col = c;
        while(c>=0){
            if(board[r][c]=='Q') return false;
            c--;
        }
        c = col;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q') return false;
            r--;
            c--;
        }
        r=row;
        c=col;
        while(r<n && c>=0){
            if(board[r][c]=='Q') return false;
            r++;
            c--;
        }
        return true;
    }
    void f(int col,int n,vector<string>& board,vector<vector<string>>& ans){
        if(col == n){
            ans.push_back(board);
            return;
        }
        for(int row = 0;row<n;row++){
            if(isSafe(board,row,col,n)){
                board[row][col] = 'Q';
                f(col+1,n,board,ans);
                board[row][col]='.';
            }
        }
    }
    vector<vector<string>> solveNQueens(int n) {
        vector<string> board;
        string row = "";
        for(int i=0;i<n;i++) row+='.';
        for(int i=0;i<n;i++) board.push_back(row);
        vector<vector<string>> ans;
        // ans.push_back(board);return ans;
        f(0,n,board,ans);
        return ans;
    }
};