package InClass_11_8_2016;

public class BTNode 
{
	private int data;
	private BTNode left;
	private BTNode right;
	
	public BTNode(int data)
	{
		this.data = data;
		left = null;
		right = null;
	}
	
	public static void setLeft(BTNode node)
	{
	
	}
	
	public static void setRight(BTNode node)
	{
		
	}
	
	public BTNode getLeft()
	{
		return this.left;
	}

	public BTNode getRight()
	{
		return this.right;
	}
	
	public void setData(int data)
	{
		data = this.data;
	}
	
	public int getData(int data)
	{
		return this.data;
	}
}
