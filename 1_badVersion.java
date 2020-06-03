
public int firstBadVersion(int n) {
			
	return firstBadVersion(n, 1, n);
}

public int firstBadVersion(int n, int start, int end)
{
	boolean badVersion = false;
	int firstFound = 0;
	
	while(start <= end)
	{
		int mid = start + (end-start)/2;
		badVersion = isBadVersion(mid);
		
		//store in firstFound if mid is bad version
		//this will be useful when no version prior to mid is bad
		if(badVersion)
			firstFound = mid;
		
		//if mid is the first version, return mid
		if(mid - start == 0 && badVersion)
			return mid;
		
		if(badVersion)
		{
			end = mid-1;
		}
		else
		{
			start = mid+1;
		}
	}
					
	return firstFound;
}
    
 
