package century.edu.pa3;

public class NodeStack 
{
	private NodeStack top;
	
	public int peek()
	{
		if(top == null)
			System.out.println("Stack is Empty");
		else
			return top.getData();
	}
	
	public int pop()
	{
		if(top == null)
			System.out.println("Stack is Empty");
	
		int topElement = top.getData();
		top = top.getLink();
		return topElement;
	}
	
	public void push(int e)
	{
		top = new NodeStack(e, top);
	}
}