// Last updated: 5/27/2026, 12:33:58 PM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int r = 0;
        int c = 0;
        boolean up = true;
        int[] ans = new int[rows*cols];
        int idx = 0;

        while(r < rows && c < cols){
            if(up){
                while(r > 0 && c < cols - 1){
                    ans[idx++] = mat[r][c];
                    r--;
                    c++;
                }
                ans[idx++] = mat[r][c];

                if(c == cols-1) r++;
                else c++;

                up = !up;
            }else{
                while(c > 0 && r < rows - 1){
                    ans[idx++] = mat[r][c];
                    r++;
                    c--;
                }
                ans[idx++] = mat[r][c];

                if(r == rows - 1) c++;
                else r++;

                up = !up;
            }
        }
        return ans;
    }
}