package InClass_11_8_2016;

public class BTree 
{
	public static void main(String[] args)
	{
		BTNode root = new BTNode(15);
		root.setLeft(new BTNode(16));
		root.setRight(new BTNode(2));
		root.getLeft().setLeft(new BTNode(40));
	}
	
	public void preOrder()
	{
		System.out.print(data);
		
		if(root.left != null)
		{
			left.preOrder();
		}
		if(root.right != null)
		{
			right.preOrder();
		}
	}
}	
