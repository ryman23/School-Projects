package century.edu.pa3;

public class MoreClass <E> 
{
	// Queue
	private Object[] data;
	private int count;
	private int front;
	private int rear;
	
	public MoreClass(int size)
	{
		data = new Object[size];
		count = 0;
	}
	
	public void add(E element)
	{
		if(count == data.length)
			expand(data.length * 2);
		
		data[rear] = element;
		count++;
		rear++;
	}
	
	private void expand(int newSize)
	{
		Object[] newArray = new Object[newSize];
		System.arraycopy(data, 0, newArray, 0, data.length);
		data = newArray;
	}
	
	public E remove()
	{
		if(count == 0)
			System.out.println("Queue Empty Exception");
		
		@SuppressWarnings("unchecked")
		E element = (E)data[0];
		data[front] = null;
		front++;
		count--;
		
		return element;
	}
	
	public static void main(String[] args)
	{
		MoreClass<Object> queue = new MoreClass<>(4);
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		System.out.println();
		queue.remove();
	}
}