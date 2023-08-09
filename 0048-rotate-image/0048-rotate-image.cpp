class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int r = matrix.size();
        
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<r/2;j++){
                swap(matrix[i][j],matrix[i][r-1-j]);
            }
        }
        
    }
};