public int[][] intervalIntersection(int[][] A, int[][] B) 
{
   List<int[]> lst = new ArrayList<int[]>();
	
	if(A.length == 0 || B.length == 0)
		return new int[][]{};
	
	int i = 0, j = 0;
	int start, end, cnt = 0;
	
	while(i < A.length && j < B.length)
	{
		
		start = Math.max(A[i][0],B[j][0]);
		end = Math.min(A[i][1],B[j][1]);
		
		if(start <= end)
		{
			lst.add(new int[]{start, end});
			cnt++;
		}
		
		if(A[i][1] == end)
			i++;
		
		if(B[j][1] == end)
			j++;
		
	}
	
	int[][] res = new  int[lst.size()][2];
	res = lst.toArray(res);
	
	return res;
}