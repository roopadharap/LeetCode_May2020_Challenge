public int findJudge(int N, int[][] trust) 
{
	int [] arr = new int[N];
	int found=0;
	
	if(trust.length == 0)
		return N;
	
	for(int i = 0; i< trust.length; i++)
	{
		if(trust[i].length == 0)
			return N;
		
		arr[trust[i][1]-1]++;
		arr[trust[i][0]-1]--;
		
		if(arr[trust[i][1]-1] == N-1)
			found = trust[i][1];
	}
	
	if(found == 0)
		return -1;
	
	if(arr[found-1] == N-1)
		return found;
	
	return -1;
}