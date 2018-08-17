package InClass_11_1_2016;

public class learning4 
{
	public static void quiz(int i)
	{
		if(i > 1)
		{
			quiz(i /2);
			quiz(i /2);
		}
		System.out.print("*");
	}
	
	public static void main(String[] args)
	{
		quiz(5);
	}
}