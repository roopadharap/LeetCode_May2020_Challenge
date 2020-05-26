public boolean checkInclusion(String s1, String s2) {
	int [] s1Arr = new int[26];
	int [] s2Arr = new int[26];
	int i, len;
	
	for(i=0; i<s1.length(); i++)
	{
		s1Arr[s1.charAt(i)-'a']++;
	}
	
	len = s1.length();
	
	for(i=0;i<s2.length(); i++)
	{
		if (i>=len){
			s2Arr[s2.charAt(i-len)-'a']--;
		}
		s2Arr[s2.charAt(i) -'a']++;
		
		if(Arrays.equals(s2Arr,s1Arr))
			return true;
	}
	
	return false;
}
 