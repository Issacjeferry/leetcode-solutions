// Last updated: 5/27/2026, 12:33:10 PM
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        int dp[] = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[src] = 0 ;
        for(int i=0;i<k+1;i++){
            int[] temp = dp.clone();
            for(int edge[]:flights){
                int u=edge[0];
                int v=edge[1];
                int wt=edge[2];
                if(dp[u]!=Integer.MAX_VALUE && dp[u]+wt < temp[v])
                    temp[v] = dp[u]+wt;
            }
            dp = temp;
        }
        return (dp[dst]==Integer.MAX_VALUE ? -1 :dp[dst]);   
    }
}