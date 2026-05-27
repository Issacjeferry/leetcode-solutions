// Last updated: 5/27/2026, 12:34:31 PM
class Solution {
    public void reverseString(char[] s) {
        int st=0;
        int end=s.length-1;
        while(st<=end){
            char ch=s[end];
            s[end] = s[st];
            s[st] = ch;
            st++;
            end--;
        }
    }
}