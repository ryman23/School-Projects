package InClass_11_1_2016;

// Recursion with factorial

public class learning2 
{
	public static int factor(int n)
	{
		if(n == 1)
		{
			return n;
		}
		else
		{
			return n * factor(--n);
		}
	}
	
	public static void main(String[] args)
	{
		factor(4);
	}
}