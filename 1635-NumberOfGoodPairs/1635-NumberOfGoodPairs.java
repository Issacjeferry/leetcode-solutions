// Last updated: 5/27/2026, 12:31:57 PM
class Solution {
        public int numIdenticalPairs(int[] A) {
        int res = 0, count[] = new int[101];
        for (int a: A) {
            res += count[a]++;
        }
        return res;
    }
}