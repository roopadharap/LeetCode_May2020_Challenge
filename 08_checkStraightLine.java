public boolean checkStraightLine(int[][] coordinates) 
{
	if(coordinates.length <= 2)
		return true;
	try
	{
		double slope = (double)(coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);

		for(int i = 2; i<coordinates.length; i++)
		{
			if(slope != (double)((coordinates[i][1] - coordinates[i-1][1]) / (coordinates[i][0] - coordinates[i-1][0])))
				return false;
		}
	}
	catch(Exception e)
	{
		return false;
	}
	
	return true;
}