public int numJewelsInStones(String J, String S) {
	int count = 0;
	char c;
	int [] capArr = new int[26];
	int [] smlArr = new int[26];
	int i, index;
	
	for(i=0; i<S.length(); i++)
	{
		c = S.charAt(i);
		if(c >= 'a' && c <= 'z')
		{
			index = c-'a';
			smlArr[index] = smlArr[index] + 1;
		}
		if(c >= 'A' && c <= 'Z')
		{
			index = c-'A';
			capArr[index] = capArr[index] + 1;
		}
	}
	
	for(i=0; i<J.length(); i++)
	{
		c = J.charAt(i);
		if(c >= 'a' && c <= 'z')
		{
			index = c-'a';
			count = count + smlArr[index];
		}
		if(c >= 'A' && c <= 'Z')
		{
			index = c-'A';
			count = count + capArr[index];
		}
	}
	
	return count;
}
