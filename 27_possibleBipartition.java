class Solution {
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    ArrayList<Integer>[] g;
    
    public boolean possibleBipartition(int N, int[][] dislikes) {
        
        int i, color;
        
        g = new ArrayList[N+1];
            
        for(i =1; i<=N; i++)
            g[i] = new ArrayList<>();
        
        //fill g
        for(int [] arr: dislikes)
        {
            g[arr[0]].add(arr[1]);
            g[arr[1]].add(arr[0]);
        }
        
        for(i=1; i<=N; i++)
        {
            if(!hm.containsKey(i))
            {
                if(!dfs(i, 0))
                    return false;
            }
        }
        
        return true;
    }
    
    public boolean dfs(Integer k, int color)
    {
        if(hm.containsKey(k))
        {
            if(hm.get(k) == color)
                return true;
            else
                return false;
        }
        
        hm.put(k, color);
        
        for(int lst: g[k])
        {
            if(!dfs(lst, color ^ 1))
                return false;
        }
        
        return true;
    }
}