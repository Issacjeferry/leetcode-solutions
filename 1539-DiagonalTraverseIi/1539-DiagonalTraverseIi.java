// Last updated: 5/27/2026, 12:32:02 PM
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer,ArrayList<Integer>> map  = new HashMap<>();
        int c=0;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.get(i).size();j++){
                map.putIfAbsent(i+j,new ArrayList<>());
                map.get(i+j).add(nums.get(i).get(j));
                c++;
            }
        }
        int res[] = new int[c];
        int ind =0;
        for(int i=0;i<map.size();i++){
            Collections.reverse(map.get(i));
            for(int j=0;j<map.get(i).size();j++){
                res[ind] = map.get(i).get(j); 
                ind++;
            }
        }
        return res;
    }
}