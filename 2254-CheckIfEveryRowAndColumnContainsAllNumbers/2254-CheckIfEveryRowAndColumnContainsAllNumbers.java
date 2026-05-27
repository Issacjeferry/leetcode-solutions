// Last updated: 5/27/2026, 12:31:14 PM
class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!valid(matrix,i,j,matrix[i][j],n)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean valid(int[][] matrix,int row,int col,int k,int n){
        for(int i=0;i<n;i++){
            if(i!=row && matrix[i][col]==k) return false;
            if(i!=col &&matrix[row][i]==k) return false;
        }
        return true;
    }
}


