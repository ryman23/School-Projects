package century.edu.pa2;

public class CourseNode 
{
	// Node to link the nodes together
	// Data to hold the course information
	
	private CourseNode link;
	private  Course data;
	
	// Getters and setters
	public CourseNode(Course data, CourseNode link) 
	{
		this.data = data;
		this.link = link;
	}

	public CourseNode getLink() 
	{
		return link;
	}

	public void setLink(CourseNode link) 
	{
		this.link = link;
	}

	public Course getData() 
	{
		return data;
	}

	public void setData(Course data) 
	{
		this.data = data;
	}
	
	public void removeNodeAfter() 
	{
		this.link = link.link;
	}
	
	public void addNodeAfter(Course data) 
	{
		link = new CourseNode(data, link);
	}
}