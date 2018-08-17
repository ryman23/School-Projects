package InClass_11_15_2016;

public class InClass 
{
	// Serial Search
	public static void search(int[] list, int target)
	{
		boolean found = false;
		int i = 0;
		int n = list.length;
		int first = 0;
		
		while((i < n) && !found)
		{
			if(list[first + i] == target)
				found = true;
			else
				i++;
		}
	
	if(found)
		System.out.println("Target: " + target + " found at index: " + i);
	else
		System.out.println("Target: " + target + " not found.");
	}
	
	// Binary Search
	public static int binarySearch(int [] list, int first, int size, int target)
	{
		int middle;
		
		if(size <= 0)
			return -1;
		else
		{
			middle = first + size/2;
			
			if(target == list[middle])
			{
				return middle;
			}
			else if(target < list[middle])
			{
				return binarySearch(list, first, size/2, target);
			}
			else
			{
				return binarySearch(list, middle + 1, (size - 1) /2, target);
			}
		}
	}
	
	public static int[] sort(int[] a, int numberUsed)
	{
		int index;
		
		for(int i = 0; i < numberUsed; i++)
		{
			for(index = 0; index < a.length - 1; index++)
			{
				if(a[index] > a[index + 1])
				{
					interchange(index, index + 1, a);
				}
			}
		}
		return a;
	}
	
	private static void interchange(int i, int j, int[] a)
	{
		int temp1; 
		
		temp1 = a[i];
		a[i] = a[j];
		a[j] = temp1;
	}
	
	public static void main(String[] args)
	{
		int size = 1000000;
		int[] list = new int[size];
		
		for(int i = 0; i < list.length; i++)
		{
			list[i] = (int) (1 + Math.random()*20000);
		}
		
		long start = System.currentTimeMillis();
		search(list, 2303);
		long end = System.currentTimeMillis();
		
		long elapsed = end - start;
		System.out.println("Time: " + elapsed + " Milliseconds");
		
		long startB = System.currentTimeMillis();
		binarySearch(list, 0, list.length, 0);
		long endB = System.currentTimeMillis();
		long elapsedB = endB- startB;
		
		System.out.println("Time: " + elapsedB + " Miliseconds.");
	}
}