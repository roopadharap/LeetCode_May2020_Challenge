public boolean isPerfectSquare(int num) 
{
	long sqr = num;
	
	while (sqr * sqr > num) 
		sqr = (sqr + num/sqr) / 2;
	
	return sqr * sqr == num;
}