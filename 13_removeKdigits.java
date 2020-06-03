public String removeKdigits(String num, int k) 
{
	String str = num;
	int i = 0;
	
	//we need to remove k digits
	for(i =0; i < k; i++)
	{
		int j =0;
		
		//loop thru till (j+1)th digit is greater than jth digit
		while(j < str.length()-1 && str.charAt(j) <= str.charAt(j+1))
		{
			j++;
		}
		
		//if (j+1)th digit is less than jth digit, delete jth digit
		str = str.substring(0, j) + str.substring(j+1, str.length());
	}
	
	i = 0;
	//remove leading zeros
	while(i < str.length() && str.charAt(i) == '0')
	{
		str = str.substring(i+1);
	}
	
	if(str.length() == 0)
		return "0";
	
	return str;
}