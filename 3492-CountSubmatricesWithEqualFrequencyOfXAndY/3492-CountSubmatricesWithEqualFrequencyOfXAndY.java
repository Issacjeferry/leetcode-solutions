// Last updated: 5/27/2026, 12:30:19 PM
class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int arr1[] = new int[col];
        int arr2[] = new int[col];
        int res = 0;
        for(int i=0;i<row;i++){
            int rx=0;
            int ry=0;
            for(int j=0;j<col;j++){
                if(grid[i][j]=='X') rx++;
                else if(grid[i][j]=='Y') ry++;

                arr1[j] += rx;
                arr2[j] += ry;

                if(arr1[j] > 0 && arr1[j]==arr2[j]) res++;
            }
        }
        return res;
    }
}