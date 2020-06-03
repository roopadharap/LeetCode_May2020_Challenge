public int findComplement(int num) 
{
	int flipped = 1;
	
	while(flipped < num)
	{
		flipped = (flipped << 1) | 1;
	}
	
	return flipped ^ num;
}