public int[] countBits(int num) 
{
	int [] arr = new int [num+1];
	
	if(num == 0)
		return arr;
	
	if(num == 1)
	{
		arr[1] = 1;
		return arr;
	}
	
	for(int i = 1; i <= num; i++)
	{
		arr[i] = arr[i & (i-1)] + 1;
	}
	
	return arr;
	
}