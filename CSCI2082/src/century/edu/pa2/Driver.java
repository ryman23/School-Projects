package century.edu.pa2;

public class Driver {
	public static void main(String[] args) {
		StudentCollection studentsList = new StudentCollection();
		
		//Create a student s1 and add c1 to it 
		Student s1 = new Student("John");
		studentsList.addStudent(s1);
		Course c1 = new Course(123, "CSCI1081", 4.0);
		CourseCollection s1CourseCollection = s1.getCoursesList();
		s1CourseCollection.addFirst(c1);
	
		Student s2 = new Student("Billy");
		studentsList.addStudent(s2);
		Course c2 = new Course(456, "CSCI2082", 3.0);
		CourseCollection s2CourseCollection = s2.getCoursesList();
		s2CourseCollection.addFirst(c2);
		
		Course c3 = new Course(678, "Math 1062", 5.0);
		s1.getCoursesList();
		s1CourseCollection.addElementAfter(c3, c1);
		
		System.out.println("All students enrolled:");
		System.out.println(studentsList);
		
		System.out.println(s1 + " Class list:");
		System.out.println(s1CourseCollection + "\n");
		
		System.out.println(s2 +" Class list:");
		System.out.println(s2CourseCollection);
	}

}
