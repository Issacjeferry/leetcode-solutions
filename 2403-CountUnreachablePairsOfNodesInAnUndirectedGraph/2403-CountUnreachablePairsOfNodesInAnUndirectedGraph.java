// Last updated: 5/27/2026, 12:31:07 PM
class Solution {
    Map<Integer,List<Integer>> map;
    long c=0;
    boolean vis[];
    int c1;
    public long countPairs(int n, int[][] edges) {
        map = new HashMap<>();
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            map.putIfAbsent(u,new ArrayList<>());
            map.putIfAbsent(v,new ArrayList<>());
            map.get(u).add(v);
            map.get(v).add(u);
        }
        // System.out.print(map);
        List<Integer> l = new ArrayList<>();
        vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                c1=0;
                dfs(i);
                l.add(c1);
            }
        }
        // System.out.print(l);
        long rem = n;
        for(int i:l){
            rem=rem-i;
            // System.out.print(rem);
            c += (long)i*rem;
        }
        return c;
    }
    public void dfs(int source){
        vis[source] = true;
        c1++;
        for(Integer i:map.getOrDefault(source,new ArrayList<>())){
            if(!vis[i]){
                dfs(i);
            }
        }
    }
}