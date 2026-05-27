// Last updated: 5/27/2026, 12:33:08 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        return s.concat(s).contains(goal);

    }
}