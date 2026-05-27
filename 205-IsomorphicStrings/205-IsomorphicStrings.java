// Last updated: 5/27/2026, 12:35:50 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h = new HashMap<>();
        

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(h.containsKey(c1) && h.get(c1)!=c2){
                return false;
            }
            if(!h.containsKey(c1) && h.containsValue(c2))     
                return false;
            h.put(c1,c2);
        }
        return true;



        
    }
}