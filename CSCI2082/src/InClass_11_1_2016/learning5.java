package InClass_11_1_2016;

public class learning5 
{
	public static int fibonacci(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n == 1)
		{
			return 1;
		}
		else
		{
			return fibonacci(n - 1) + fibonacci(n-2);
		}
		
	}
	
	public static void main(String[] args)
	{
		for(int x = 0; x < 6; x++)
		{
			System.out.print(fibonacci(x));
		}
	}
}