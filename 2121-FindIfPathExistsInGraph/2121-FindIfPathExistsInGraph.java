// Last updated: 5/27/2026, 12:31:24 PM
class Solution {
    static Map<Integer, List<Integer>> map;
    static boolean vis[];

    static boolean dfs(int source, int destination) {
        vis[source] = true;
        if(source==destination){
            return true;
        }
        for (int i : map.get(source)) {
            if (!vis[i]) {
                if(dfs(i, destination)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        map = new HashMap<>();
        vis = new boolean[n];
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            map.putIfAbsent(u, new ArrayList<>());
            map.putIfAbsent(v, new ArrayList<>());
            map.get(u).add(v);
            map.get(v).add(u);
        }
        return dfs(source, destination);

    }

}