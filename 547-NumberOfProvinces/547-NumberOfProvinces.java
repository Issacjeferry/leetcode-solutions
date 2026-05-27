// Last updated: 5/27/2026, 12:33:45 PM
class Solution {
    Map<Integer,ArrayList<Integer>> map;
    boolean vis[];
    public int findCircleNum(int[][] isConnected) {
        map = new HashMap<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            map.putIfAbsent(i,new ArrayList<>());
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    map.get(i).add(j);
                }
            }
        }
        int count=0;
        vis = new boolean[n+1];
        for(int i=0;i<n;i++){ // there may be two or more graphs so should send it differently
            if(!vis[i]){
                dfs(i);
                count++;
            }
        }
    return count;
    }
    void dfs(int source){
        vis[source] = true;
        for(int i:map.get(source)){
            if(!vis[i]){
                dfs(i);
            }
        }
    }
}