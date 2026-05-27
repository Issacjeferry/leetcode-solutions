// Last updated: 5/27/2026, 12:30:28 PM
class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        k=k%n;
        if(k==0) return true;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!= mat[i][(j-k+n)%n]){
                    return false;
                }
            }
        }
        return true;
    }
}