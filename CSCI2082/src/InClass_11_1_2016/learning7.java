package InClass_11_1_2016;

public class learning7 
{
	public static int mult(int m, int n)
	{
		if(n == 1)
			return m;
		else
			return mult(m * n-4, --n);
	}
	
	public static void main(String[] args)
	{
		System.out.print(mult(4,3));
	}
}