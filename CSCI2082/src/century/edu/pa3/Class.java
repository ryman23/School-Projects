package century.edu.pa3;

public class Class<T>
{
	private Object[] data;
	private int count;
	
	public Class()
	{
		data = new Object[10];
		count = 0;
	}
	
	public void push(int element)
	{
		if(count == data.length)
			//throw new FullStackException("Stack Full");
		
		data[count] = element;
		count++;
	}
	
	@SuppressWarnings("unchecked")
	public T pop()
	{
		if(count == 0)
		{
			// throw new EmptyStackException("Stack is Empty");
		}
		
		T topElement = (T) data[count - 1];	
		count --;
		
		return topElement;
	}
	
	@SuppressWarnings("unchecked")
	public T peek()
	{
		if(count == 0)
		{
			// throw new EmptyStackException("Stack is Empty");
		}
		
		return (T) data[count - 1];
	}
	
	public int size()
	{
		return count;
	}
	
	public int getCapacity()
	{
		return data.length;
	}
	
	public boolean isEmpty()
	{
		return count == 0;
	}
	
	public static void main(String[] args)
	{
		Class<String> myStack = new Class<>();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		
		while(!myStack.isEmpty())
		{
			System.out.println(myStack.pop());
		}
	}
}