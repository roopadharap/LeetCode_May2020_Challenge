public int[][] kClosest(int[][] points, int K) 
{
	int [] arr = new int [points.length];
	int [][] res = new int[K][2];
	int cnt = 0;
	
	for(int i = 0; i < points.length; i++)
	{
		arr[i] = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
	}
	
	Arrays.sort(arr);
	
	for(int i =0; i<points.length; i++)
	{
		if((points[i][0] * points[i][0]) + (points[i][1] * points[i][1]) <= arr[K-1])
		{
			res[cnt] = points[i];
			cnt++;
		}
	}
	
	return res;
}