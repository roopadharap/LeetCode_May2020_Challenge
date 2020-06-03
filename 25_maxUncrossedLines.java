public int maxUncrossedLines(int[] A, int[] B) 
{
	if(A.length == 0 || B.length == 0)
		return 0;
	
	if(A.length == 1 && B.length == 1 && A[0] != B[0])
		return 0;
	
	int[][] arr = new int[A.length+1][B.length+1];
	for (int i = 1; i <= A.length; i++)
	{
		for (int j = 1; j <= B.length; j++)
		{
			if (A[i - 1] == B[j - 1])
				arr[i][j] = 1 + arr[i - 1][j - 1];
			else
				arr[i][j] = Math.max(arr[i][j - 1], arr[i - 1][j]);
		}
	}
	
	return arr[A.length][B.length];
}