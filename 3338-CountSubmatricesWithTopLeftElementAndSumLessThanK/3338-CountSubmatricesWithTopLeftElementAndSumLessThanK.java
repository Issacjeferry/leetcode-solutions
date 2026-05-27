// Last updated: 5/27/2026, 12:30:24 PM
class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int c = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i>0){
                    grid[i][j] += grid[i-1][j];
                }
                if(j>0){
                    grid[i][j] += grid[i][j-1];
                }
                if(i>0 && j>0){
                    grid[i][j] -= grid[i-1][j-1];
                }
                if(grid[i][j] <= k)
                    c++;
            }
        }
        return c;
    }
}




