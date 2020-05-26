
public List<Integer> findAnagrams(String s, String p) 
{
	int[]sstr = new int[26];
	int[]pstr = new int[26];
	
	for (char c: p.toCharArray())
		pstr[c-'a']++;
	
	int n = p.length();
	List<Integer>res = new ArrayList<>();
	
	for (int i=0; i<s.length(); i++)
	{
		char c=s.charAt(i);
		
		//sliding window technique: decrease value for i-n th element going out of window
		//and increase value for ith element getting added to window
		
		if (i>=n)
		{
			sstr[s.charAt(i-n)-'a']--;
		}
		
		sstr[c-'a']++;
		
		if (Arrays.equals(sstr,pstr))
			res.add(i-n+1);
	}
	
	return res;
}

