// Last updated: 5/27/2026, 12:33:56 PM
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int dp[][] = new int[n][n];
        if(n==0) return 0;
        for(int i=0;i<n;i++){
            dp[i][i]=1;
        }
        //for len 2
        // for(int i=0;i<=n-2;i++){
        //     int j=i+2-1;
        //     if(s.charAt(i)==s.charAt(j)){
        //         dp[i][j]=2
        //     }else{
        //         dp[i][j]=1;
        //     }
        // }
        for(int len=2;len<=n;len++){
            for(int i=0;i<=n-len;i++){
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j)){
                    if(len==2) 
                        dp[i][j]=2;
                    else 
                        dp[i][j]=dp[i+1][j-1]+2;
                }else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }

            }
        }
        return dp[0][n-1];

    }
}