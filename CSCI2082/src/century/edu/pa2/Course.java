package century.edu.pa2;

public class Course 
{
	// Variables for the items required 
	private int ID;
	private String name;
	private double gpa;
	
	// Getters and setters
	public Course(int ID, String name, double gpa)
	{
		this.ID = ID;
		this.name = name;
		this.gpa = gpa;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getGPA()
	{
		return gpa;
	}
	
	public void setID(int ID)
	{
		this.ID = ID;
	}
	
	public void setName(String name)
	{
		this.name= name;
	}
	
	public void setGPA(double gpa)
	{
		this.gpa = gpa;
	}
	 
	@Override
	public String toString()
	{
		return "Course: " + name + " GPA: " + gpa + " CourseID: " + ID;
	}
}