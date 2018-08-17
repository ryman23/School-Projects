package InClass_11_1_2016;

public class learning3 
{
	public static void print(int x)
	{
		if(x >= 1)
		{
			System.out.print("*");
			print(--x);
			System.out.print("!");
		}
		
	}
	public static void main(String[] args)
	{
		print(5);
	}
}