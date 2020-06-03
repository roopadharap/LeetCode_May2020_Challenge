public boolean isCousins(TreeNode root, int x, int y) 
{
	int level = 1, l1=0, l2=0;
	boolean n1 = false, n2 = false;
	
	Queue<TreeNode> q = new LinkedList<TreeNode>();
	q.add(root);
	q.add(null);
	
	while(!q.isEmpty())
	{
		TreeNode temp = q.poll();
		
		if(temp == null)
		{
			if(!q.isEmpty())
			{
				level++;
				q.add(null);
			}
		}
		else
		{
			if(temp.left != null && temp.right != null)
			{
				if((temp.left.val == x && temp.right.val == y) || (temp.left.val == y && temp.right.val == x))
					return false;
			}
			
			if(temp.left != null)
			{
				if(temp.left.val == x)
				{
					n1 = true;
					l1 = level;
				}
				else if(temp.left.val == y)
				{
					n2 = true;
					l2 = level;
				}

				q.add(temp.left);
			}
			
			if(temp.right != null)
			{
				if(temp.right.val == x)
				{
					n1 = true;
					l1 = level;
				}
				else if(temp.right.val == y)
				{
					n2 = true;
					l2 = level;
				}

				q.add(temp.right);
			}
			
			if((n1 && n2) && (l1 != 0 && l2 != 0) && l1 == l2 )
				return true;
			
		}
	}
	
	 return false;
}