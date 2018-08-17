package finalProject;

import java.util.Stack;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CalcStack 
{
	public static final Pattern UNSIGNED_DOUBLE = Pattern.compile("((\\d+\\.?\\d*)|(\\.\\d+))([Ee][-+]?\\d+)?.*?");
	public static final Pattern CHARACTER = Pattern.compile("\\S.*?");
	
	public static Double evaluate(String expression)
	{
		Stack<Double> numbers = new Stack<Double>();
		Stack<Character> operations = new Stack<Character>();
		
		Scanner input = new Scanner(expression);
		String next;
		
		while(input.hasNext())
		{
			if(input.hasNext(UNSIGNED_DOUBLE))
			{
				next = input.findInLine(UNSIGNED_DOUBLE);
				numbers.push(new Double(next));
			}
			else
			{
				next = input.findInLine(CHARACTER);
				switch(next.charAt(0))
				{
				case '+':
				case '-':
				case '*':
				case '/':
					operations.push(next.charAt(0));
					break;
				case ')': 
					evaluateStackTops(numbers, operations);
					break;
				case '(':
					isParenthesisMatch(next);
					break;
				default:
					throw new IllegalArgumentException("Illegal Character");
				}
			}
		}
		if(numbers.size() != 1)
		{
			throw new IllegalArgumentException("Illegal input expression");
		}
		return numbers.pop();
	}
	
	public static void evaluateStackTops(Stack<Double> numbers, Stack<Character> operations)
	{
		double operand1, operand2;
		if((numbers.size() < 2) || (operations.isEmpty()))
			throw new IllegalArgumentException("Illegal expression");
		operand1 = numbers.pop();
		operand2 = numbers.pop();
		
		switch(operations.pop())
		{
		case '+': numbers.push(operand1 + operand2);
				  break;
		case '-': numbers.push(operand1 - operand2);
				  break;
		case '*': numbers.push(operand1 * operand2);
				  break;
		case '/': numbers.push(operand1 / operand2);
				  break;
		default: throw new IllegalArgumentException("Illegal operation");
		}
	}
	
	public static void isParenthesisMatch(String parenthesis) 
	{
	    Stack<Character> stack = new Stack<Character>();

	    char c;
	    for(int i=0; i < parenthesis.length(); i++) {
	        c = parenthesis.charAt(i);

	        if(c == '(')
	            stack.push(c);
	        else if(c == ')')
	        	stack.pop();
	        else if(stack.peek() == '(')
	            stack.pop();
	    }
	}
}
