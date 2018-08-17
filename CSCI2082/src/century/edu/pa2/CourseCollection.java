package century.edu.pa2;

import century.edu.pa2.CourseNode;

public class CourseCollection 
{
	private CourseNode head;
	private CourseNode tail;
	
	// Add a course to the first node
	public void addFirst(Course element) 
	{
		if(head == null) 
		{
			head = new CourseNode(element, head);
			tail = head;
		} 
		else 
			head = new CourseNode(element, head);
	}
	
	// Remove a specific course by finding it then removing it
	public void removeTarget(Course element) 
	{
		
		if (head != null && head.getData().equals(element)) 
		{
			removeFirst();
		} 
		else if (tail != null && tail.getData().equals(element)) 
		{
			removeTail();
		} else 
		{
			CourseNode node = getNodeBefore(element);
			node.removeNodeAfter();
		}
	}
	
	// Add a course after another course in the next node
	public void addElementAfter(Course element, Course target)
	{
		if (head != null && head.getData().equals(target)) 
		{
			head.addNodeAfter(element);
		} 
		else 
		{
			CourseNode targetNode = search(target);
			if (targetNode != null)
				targetNode.addNodeAfter(element);
		}
	}
	
	// Search for a specific course in a specific node
	public CourseNode search(Course target)
	{
		CourseNode cursor;
		
		for (cursor = head; cursor != null; cursor = cursor.getLink()) 
		{
			if (cursor.getData().equals(target)) 
				return cursor;
		}
		
		return null;
	}
	
	// Get the information of the node before another node
	public CourseNode getNodeBefore(Course target) 
	{
		CourseNode currentNode;
		CourseNode nodeBefore;
		
		for (currentNode = head, nodeBefore = null; currentNode != null; 
				nodeBefore = currentNode, currentNode = currentNode.getLink())
		{
			
			if (currentNode.getData().equals(target)) 
			{
				return nodeBefore;
			}	
		}
		
		return null;
	}
	
	// Remove the tail node
	public void removeTail() 
	{
		if (head != null && head == tail)
		{
			removeFirst();
		} 
		else 
		{
			CourseNode currentNode;
			CourseNode nodeBefore;
			
			for (currentNode = head, nodeBefore = null; currentNode != null; 
					nodeBefore = currentNode, currentNode = currentNode.getLink()) 
			{
				if (currentNode == tail) 
				{
					tail = nodeBefore;
					tail.setLink(null);
				}	
			}
		}
	}
	
	// Remove the first node
	public void removeFirst() 
	{
		head = head.getLink();
	}
	
	@Override
	public String toString() 
	{
		CourseNode cursor;
		String info = "";
		
		for (cursor = head; cursor != null; cursor = cursor.getLink())
		{
			info += cursor.getData();
			
			if (cursor.getLink() != null)
				info += info + "\n";
		}
		return info;
	}
}