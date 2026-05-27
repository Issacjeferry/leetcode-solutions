// Last updated: 5/27/2026, 12:33:42 PM
class Solution {
    public int distributeCandies(int[] arr) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i:arr){
            s.add(i);
            if(s.size() == arr.length/2) break;
        }

        return s.size();

    }
}