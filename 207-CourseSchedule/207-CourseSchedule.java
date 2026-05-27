// Last updated: 5/27/2026, 12:35:46 PM
class Solution {
    Map<Integer,ArrayList<Integer>> map = new HashMap<>();
    Set<Integer> visited =  new HashSet<>();
    Set<Integer> pathvisited =  new HashSet<>();
    int flag = 0;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int[] v : prerequisites){
            map.putIfAbsent(v[0],new ArrayList<>());

            map.get(v[0]).add(v[1]);
        }
        for(Integer key : map.keySet()){
            if(!visited.contains(key)){
                dfs(key);
            }
        }
        System.out.print(map);
        return flag!=1;
    }

    public void dfs(int s){
        visited.add(s);
        pathvisited.add(s);

        for(Integer v : map.getOrDefault(s,new ArrayList<>())){
            if(!visited.contains(v)){
                dfs(v);
            }
            else if(pathvisited.contains(v)){
                flag = 1;
                return;
            }
        }
        pathvisited.remove(s);
    }
        
}