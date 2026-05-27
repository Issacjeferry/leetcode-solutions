// Last updated: 5/27/2026, 12:35:10 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> h= new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!h.containsKey(ch) || h.get(ch)==0) return false;
            h.put(ch,h.get(ch)-1);
        }
        for(char ch:h.keySet()){
            if(h.get(ch)!=0 )
                return false;
        }
        return true;

    }
}