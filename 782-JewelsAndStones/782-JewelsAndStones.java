// Last updated: 5/27/2026, 12:33:15 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> hs = new HashMap<>();
        int c=0;
        for(int i=0;i<stones.length();i++){
            char ch = stones.charAt(i);
            hs.put(ch,hs.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            if(hs.containsKey(jewels.charAt(i))){
                c+=hs.get(jewels.charAt(i));
            }
        }
        return c;
        
    }
}