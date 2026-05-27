// Last updated: 5/27/2026, 12:35:38 PM
class Solution {
    public int[] findOrder(int numCourses, int[][] p) {
        HashMap<Integer,List<Integer>> h = new HashMap<>();
        int[] ind = new int[numCourses];
        for(int i=0;i<p.length;i++)
        {
            int u = p[i][1];
            int v = p[i][0];
            ind[v]++;
            h.putIfAbsent(u,new ArrayList<>());
            h.get(u).add(v);
        }
        int flag=1;
        int res[] = new int[numCourses],index=0;
        while(flag==1)
        {
            int count=0;
            for(int i=0;i<ind.length;i++)
            {
                if(ind[i]==0)
                {
                    count++;
                    ind[i]=-1;
                    res[index++]=i;
                    if(!h.containsKey(i))
                        break;
                    List<Integer> t = h.get(i);
                    for(int j=0;j<t.size();j++)
                    {
                        ind[t.get(j)]--;
                    }
                    break;
                }
            }
            if(count==0)
                flag=0;
        }
        for(int i=0;i<ind.length;i++)
        {
            if(ind[i]!=-1)
                return new int[0];
        }
        return res;
    }
}