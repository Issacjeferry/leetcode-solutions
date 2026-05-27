// Last updated: 5/27/2026, 12:31:34 PM
class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length()-2;i++){
            char c1 =s.charAt(i);
            char c2 =s.charAt(i+1);
            char c3 =s.charAt(i+2);
            if((c1!=c2) && (c1!=c3) && (c3!=c2)){
                c++;
            }
        }
        return c;

    }
}