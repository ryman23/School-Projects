package century.edu.pa3;

import java.util.Stack;

public class StackAttack
{
	private char[] input;
	private int count;
	
	public StackAttack()
	{
		input = new char[20];
		count = 0;
	}
	
	public void push(char element)
	{
		if(count == input.length)
			throw new IllegalArgumentException("Stack is full");
		
		input[count] = element;
		count++;
	}

	public Character pop()
	{
		if(count == 0)
		{
			 throw new IllegalArgumentException("Stack is Empty");
		}
		
		char topElement = input[count - 1];	
		count --;
		
		return topElement;
	}
	
	public Character peek()
	{
		if(count == 0)
		{
			 throw new IllegalArgumentException("Stack is Empty");
		}
		
		return input[count - 1];
	}
	
	public boolean isBalanced(String in)
	{
		Stack<Character> myStack = new Stack<Character>();
		
		for(char chr : in.toCharArray())
		{
			switch(chr)
			{
			case '(':
			case '{':
			case '[':
			case '<':
				myStack.push(chr);
				break;
				
			case ')':
				if(myStack.isEmpty() || myStack.pop() != ')')
					return false;
				break;
			case '}':
				if(myStack.isEmpty() || myStack.pop() != '{')
					return false;
				break;
			case ']':
				if(myStack.isEmpty() || myStack.pop() != '{')
					return false;
				break;
			case '>':
				if(myStack.isEmpty() || myStack.pop() != '{')
					return false;
				break;
			}
		}
		return myStack.isEmpty();
	}
	
	public int size()
	{
		return count;
	}
	
	public int getCapacity()
	{
		return input.length;
	}
	
	public boolean isEmpty()
	{
		return count == 0;
	}+-*////
	
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