package InClass_11_15_2016;

public class InClass2 
{
	// Binary Search
	public int binarySearch(int [] list, int first, int size, int target)
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
				return binarySearch(list, middle, size/2, target);
			}
			else
			{
				return binarySearch(list, middle, (size - 1) /2, target);
			}
		}
	}
	
	
}