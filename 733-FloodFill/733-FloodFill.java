// Last updated: 5/27/2026, 12:33:22 PM
class Solution {
    public void dfs(int[][] image,int i,int j,int m,int n,int color,int currcol,boolean[][] vis){
        if(i < 0 || j < 0 ||i >=m || j>=n || vis[i][j] || image[i][j]!=currcol){
            return;
        }
        vis[i][j]=true;
        image[i][j]=color;
        dfs(image, i+1,j,m,n,color,currcol,vis);
        dfs(image, i-1,j,m,n,color,currcol,vis);
        dfs(image, i,j+1,m,n,color,currcol,vis);
        dfs(image, i,j-1,m,n,color,currcol,vis);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initcol = image[sr][sc];
        int m=image.length;
        int n=image[0].length;
        boolean vis[][] = new boolean[m][n];
        dfs(image,sr,sc,m,n,color,initcol,vis);
        return image;

        
    }
}