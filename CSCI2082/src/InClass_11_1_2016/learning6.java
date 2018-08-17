package InClass_11_1_2016;

public class learning6 
{
	public static int power(int x, int y)
	{
		if(y == 1)
		{
			return 1;
		}
		else
		{
			return power(x,y);
		}
	}
	
	
	public static void main(String[] args)
	{
		System.out.print(power(3,3));
	}
}