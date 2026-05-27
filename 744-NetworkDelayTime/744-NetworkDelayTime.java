// Last updated: 5/27/2026, 12:33:21 PM
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer,ArrayList<int[]>> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[] i:times){
            int u=i[0];
            int v=i[1];
            int w=i[2];
            map.get(u).add(new int []{v,w});
        }

        int dis[] = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[k]=0;
        dis[0]=0; // 1 based indexing so that 
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b) -> a[0]-b[0]);
        pq.add(new int[]{k,0});
        while(!pq.isEmpty()){
            int[] x = pq.poll();
            int u = x[0];
            int w = x[1];

            for(int[] edge:map.get(u)){
                int v=edge[0];
                int wgt = edge[1];

                if(dis[u]+wgt < dis[v]){
                    dis[v] = dis[u]+wgt;
                    pq.add(new int[]{v,wgt});
                }
            }
        }
        int a = 0;
        for(int i=0;i<=n;i++){
            if(dis[i]==Integer.MAX_VALUE)
                return -1;
            a = Math.max(a,dis[i]);
        }
        return a;
    }
}