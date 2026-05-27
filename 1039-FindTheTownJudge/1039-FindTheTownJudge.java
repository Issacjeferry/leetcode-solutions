// Last updated: 5/27/2026, 12:32:38 PM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] indeg = new int[n+1];
        int[] outdeg = new int[n+1];

        if(n==1)
            return 1;
        
        for(int i=0;i<trust.length;i++){
            outdeg[trust[i][0]]++;
            indeg[trust[i][1]]++;
        }

        for(int i=0;i<=n;i++){
            if(indeg[i]==n-1 && outdeg[i]==0)
                return i;
        }
        return -1;
        
    }
}