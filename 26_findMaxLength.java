public int findMaxLength(int[] nums) {
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	
	int result = 0;
	int count = 0;
	
	hm.put(0, -1);
	
	for (int i=0; i<nums.length; i++) 
	{
		if (nums[i] == 0)   
			count--;
		else                
			count++;
		
		if (hm.containsKey(count)) 
		{
			result = Math.max(result, i - hm.get(count));
		} else 
		{
			hm.put(count, i);
		}
	}
	
	return result;
}
    
 
