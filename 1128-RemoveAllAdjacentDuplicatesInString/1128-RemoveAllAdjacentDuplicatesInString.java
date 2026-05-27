// Last updated: 5/27/2026, 12:32:29 PM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }else
                st.push(s.charAt(i));
        }
        StringBuilder str = new StringBuilder();
        while(!st.empty()){
            str.append(st.pop());
        }
        return str.reverse().toString();

        
    }
}