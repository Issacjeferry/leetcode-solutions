// Last updated: 5/27/2026, 12:33:04 PM
class Solution {
    //static Map<Integer,List<Integer>> map;
    static boolean vis[];
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        vis = new boolean[rooms.size()];
        dfs(0,rooms);

        for(int i=0;i<rooms.size();i++){
            if(!vis[i]){
                return false;
            }
        }
        return true;       
    }
    static void dfs(int source,List<List<Integer>> rooms){
        vis[source]=true;

        for(int i:rooms.get(source)){
            if(!vis[i]){
                dfs(i,rooms);
            }
        }


    }
}