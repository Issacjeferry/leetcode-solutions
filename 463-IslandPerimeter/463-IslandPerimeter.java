// Last updated: 5/27/2026, 12:34:06 PM
class Solution {
    public int islandPerimeter(int[][] arr) {
        int sum=0;
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==1){
                    sum+=4;
                
                if(i>0  && arr[i-1][j]==1) 
                    sum-=2;
                if(j>0 && arr[i][j-1]==1) 
                    sum-=2;
            }
        }
        }
        return sum;
    }
}