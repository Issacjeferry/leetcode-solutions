// Last updated: 5/27/2026, 12:30:29 PM
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int len = m*n;
        int mod = 12345;
        int prev[] = new int[len];
        int suff[] = new int[len];

        prev[0]=1;
        for(int i=1;i<len;i++){
            int val = grid[(i-1)/n][(i-1)%n];
            prev[i] = (int)((long)prev[i-1] * val % mod);
        }

        suff[len-1]=1;
        for(int i=len-2;i>=0;i--){
            int val = grid[(i+1)/n][(i+1)%n];
            suff[i] = (int)((long)suff[i+1] * val % mod);
        }

        int res[][] = new int[m][n];
        for(int i=0;i<len;i++){
            res[i/n][i%n] = (int)((long)prev[i] * suff[i]% mod);
        }
        return res;

    }
}