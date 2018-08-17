package century.edu.pa2;

public class Student 
{
	// Variables required for the student
	private String name;
	private int id = 100;
	private CourseCollection coursesList;
	
	// Getters and setters
	public Student(String name)
	{
		this.name = name; 
		this.id = id;
		this.coursesList = new CourseCollection();
	}
	
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public CourseCollection getCoursesList()
	{
		return coursesList;
	}

	public void setCoursesList(CourseCollection coursesList)
	{
		this.coursesList = coursesList;
	}

	public String getName()
	{
		return name;
	}
	
	public int getID()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (obj instanceof Student) 
		{
			Student otherStud = (Student) obj;
			String otherName = otherStud.name;
			int otherID = otherStud.id;
			
			return (this.name.equals(otherName) && this.id == otherID);
		}
		return super.equals(obj);
	}
	@Override
	public String toString() 
	{
		return "Student: " + name + "  ID: " + id + "\n" + coursesList;
	}
}