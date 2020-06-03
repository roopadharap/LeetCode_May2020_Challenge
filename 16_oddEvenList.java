public ListNode oddEvenList(ListNode head) 
{
	ListNode l1 = null, l2 = null, l2Head = null, l1Head = null, curr = head;
	
	if(curr == null)
		return null;
	
	if(curr.next == null || curr.next.next == null)
		return curr;
	
	int cnt = 1;
	
	while(curr != null)
	{
		if(cnt % 2 == 1)
		{
			if(l1 == null)
			{
				l1 = curr;
				l1Head = l1;
			}
			else
			{
				l1.next = curr;
				l1 = l1.next;
			}
		}
		else
		{
			if(l2 == null)
			{
				l2 = curr;
				l2Head = l2;
			}
			else
			{
				l2.next = curr;
				l2 = l2.next;
			}
		}
		
		cnt++;
		curr = curr.next;
	}
	
	l1.next = l2Head;
	l2.next = null;
		
	return l1Head;
}