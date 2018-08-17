package century.edu.pa3;

import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		StackAttack myStack = new StackAttack();
		
		String s = "{ < > }";
		
		myStack.isBalanced(s);
		
		 if(args.length != 0) 
		 {
	            if(myStack.isBalanced(s))
	                System.out.println(s + " is balanced");
	            else
	                System.out.println(s + " is not balanced");
	        }
//		Scanner input = new Scanner(System.in);
	
	}
}