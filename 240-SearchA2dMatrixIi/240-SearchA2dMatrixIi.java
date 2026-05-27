// Last updated: 5/27/2026, 12:35:12 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int st=0;
        int end=col-1;
        while(st<row && end>=0){
            if(matrix[st][end]==target){
                return true;
            }else if(matrix[st][end]>target){
                end--;
            }else{
                st++;
            }
        }
        return false;

    }
}