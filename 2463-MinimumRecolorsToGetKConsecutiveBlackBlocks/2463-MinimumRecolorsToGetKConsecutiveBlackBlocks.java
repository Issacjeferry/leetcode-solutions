// Last updated: 5/27/2026, 12:31:04 PM
class Solution {
    public int minimumRecolors(String b, int k) {
        int n=b.length();
        int mi =0;
        int ans=0;
        for(int i=0;i<k;i++){
            if(b.charAt(i)=='W'){
                ans++;
            }
        }
        mi=ans;
        for(int i=1;i<n-k+1;i++){
            if(b.charAt(i-1)=='W'){
                ans--;
            }if(b.charAt(i+k-1)=='W'){
                ans++;
            }
           mi = Math.min(ans,mi);
        }
        return mi;
    }
}