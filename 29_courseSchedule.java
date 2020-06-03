public boolean canFinish(int numCourses, int[][] prerequisites) 
{
	if(prerequisites.length == 0)
		return true;
	
	HashMap<Integer, List<Integer>> hm = new HashMap<Integer, List<Integer>>();
	Queue<Integer> q = new LinkedList<Integer>();
	int index = 0;
	int course, prereq;
	int [] inDeg = new int [numCourses];
	
	for(int i=0; i<prerequisites.length; i++)
	{
		course = prerequisites[i][0];
		prereq = prerequisites[i][1];
		List<Integer> tmpLst = hm.getOrDefault(prereq, new ArrayList<Integer>());
		tmpLst.add(course);
		hm.put(prereq, tmpLst);
		inDeg[course]++;
	}
	
	for(int i=0; i<numCourses; i++)
	{
		if(inDeg[i] == 0)
			q.add(i);
	}
	
	while(!q.isEmpty())
	{
		int temp = q.remove();
		index++;
		
		if(hm.containsKey(temp))
		{
			for(Integer lstItem : hm.get(temp))
			{
				inDeg[lstItem]--;
				
				if(inDeg[lstItem] == 0)
					q.add(lstItem);
			}
		}
	}
	
	if(index == numCourses)
		return true;
	
	
	return false;
}