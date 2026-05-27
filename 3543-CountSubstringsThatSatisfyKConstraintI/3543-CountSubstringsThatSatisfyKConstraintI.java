// Last updated: 5/27/2026, 12:30:16 PM
class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int c=0;
        for(int i=0;i<s.length();i++){
            int zect=0,onct=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='0') zect++;
                else onct++;
                if(zect > k && onct > k) break;
                c++;
            }
        }
        return c;
    }
}