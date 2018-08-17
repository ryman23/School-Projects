package century.edu.pa2;

import java.util.ArrayList;


public class StudentCollection
{
	// ArrayList of student names
	private ArrayList<Student> list;

	// Initialize the ArrayList
	public StudentCollection() 
	{
		list = new ArrayList<>();
	}
	
	//Add students to the ArrayList
	public void addStudent(Student s) 
	{
		list.add(s);
	}
	
	// Remove students form the ArrayList
	public void removeStudent(Student s)
	{
		list.remove(s);
	}
	
	public Student searchByName(String name)
	{
		for(Student s : list)
		{
			if(s.getName().equals(name));
					return s;
		}
		return null;
	}
	
	@Override
	public String toString() 
	{
		String info= "";
		
		for (Student student : list) 
		{
			info += student.toString() + "\n";
			
		}
		return  info;
	}
}