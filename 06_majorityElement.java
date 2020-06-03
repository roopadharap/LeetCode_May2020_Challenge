public int majorityElement(int[] nums) 
{
   HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	int maxNum = 0, maxCnt = 0, val;
	
	if(nums.length == 1)
		return nums[0];
	
	for(int i = 0; i<nums.length; i++)
	{
		if(hm.containsKey(nums[i]))
		{
			val = hm.get(nums[i]) + 1;
			hm.put(nums[i], val);
			
			if(maxCnt < hm.get(nums[i]))
			{
				maxCnt = hm.get(nums[i]);
				maxNum = nums[i];
			}
		}
		else
			hm.put(nums[i], 1);
	}
	
	return maxNum;
}