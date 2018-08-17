package century.edu.pa4;
import java.util.Scanner;

public class Recursion 
{
	public static int factorial(int n)
	{	
		if(n == 1)
		{
			return n;
		}
		else
		{
			return n * factorial(--n);
		}
	}
	
	public static String pins(int x)
	{
		
		if(x <= 0)
		{
			return "";
		}
		
		String p = pins(x - 1);
		p = p + "*";
		System.out.println(p);
		
		return p;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a value to find the factorial of: ");
		int input = sc.nextInt();
		
		System.out.println("The value of " + input + " factorial is: " + factorial(input));
		
		System.out.println("Enter another value to make an '*' triangle: ");
		input = sc.nextInt();
		
		pins(input);
	}
}