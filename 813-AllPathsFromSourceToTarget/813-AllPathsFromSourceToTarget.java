// Last updated: 5/27/2026, 12:33:07 PM
class Solution {
    static List<List<Integer>> res;
    static Map<Integer,List<Integer>> map ;
    static List<Integer> path = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        map = new HashMap<>();
        res = new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            map.put(i,new ArrayList<>());
            for(int j=0;j<graph[i].length;j++){
                map.get(i).add(graph[i][j]);
            }
        }
        dfs(0,graph.length-1);
        return res;

    }
    public void dfs(int start,int n){
        path.add(start);
        if(start==n){
            res.add(new ArrayList<>(path));
        }
        for(int i:map.get(start)){
            if(!path.contains(i)){
                dfs(i,n);
            }
        }
        path.remove(path.size()-1);

    }
}