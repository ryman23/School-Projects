package InClass_11_1_2016;

// Recursion

public class learning 
{
	public static void print(int n)
	{
		// Base case
		if(n < 10)
		{
			System.out.println(n);
		}
		else
		{	
			print(n / 10);
			System.out.println(n % 10);
		}
	}
	
	public static void main(String[] args)
	{
		print(12345);
	}
}