public String frequencySort(String s) {
	String res = "";
	StringBuilder sb = new StringBuilder();
	
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			
	//fill hashmap
	for(int i = 0; i<s.length(); i++)
	{
		if(hm.containsKey(s.charAt(i)))
			hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
		else
			hm.put(s.charAt(i), 1);
	}
	
	//sort hashmap
	List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(hm.entrySet());
	// Sort the list 
	Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() { 
		public int compare(Map.Entry<Character, Integer> o1,  
						   Map.Entry<Character, Integer> o2) 
		{ 
			return (o2.getValue()).compareTo(o1.getValue()); 
		} 
	}); 
	
	//create string
	for(int i = 0; i<list.size(); i++)
	{
		int cnt = 0;
		while(cnt < list.get(i).getValue())
		{
			sb.append(list.get(i).getKey());
			cnt++;
		}
	}
	
	return sb.toString();
}
    
 
