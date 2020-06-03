public int maxSubarraySumCircular(int[] A) 
{
	int maxSum = Integer.MIN_VALUE, maxSumNeg = Integer.MIN_VALUE;
	int currSum = 0, currSumNeg = 0;
	int arrSum = 0;
	int len = A.length;
	
	for(int i=0; i < len; i++)
	{
		currSum = currSum + A[i];
		currSumNeg = currSumNeg + (-A[i]);
		
		//stores total sum of array
		arrSum = arrSum + A[i];

		 if(maxSum < currSum)
			 maxSum = currSum;
		 if(currSum < 0)
			 currSum = 0;
		 
		 if(maxSumNeg < currSumNeg)
			 maxSumNeg = currSumNeg;
		 if(currSumNeg < 0)
			 currSumNeg = 0;
	}
	
	//add the maxSum of inverted array here since it is positive 
	arrSum = arrSum + maxSumNeg;
	
	if(arrSum > maxSum  && arrSum != 0)
		return arrSum;
	
	return maxSum;
}