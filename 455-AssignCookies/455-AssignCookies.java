// Last updated: 5/27/2026, 12:34:07 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        int l=0,r=0;
        while(l<g.length && r<s.length){
            if(s[r]>=g[l]){
                c++;
                l++;
                r++;
            }else{
                r++;
            }
        }
        return c;
    }
}