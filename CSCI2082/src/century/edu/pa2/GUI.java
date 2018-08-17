package century.edu.pa2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;

public class GUI extends JFrame implements ActionListener
{	
	private static JPanel topPanel;
	private JButton addStud;
	private JButton remStud;
	private JButton addCourse;
	private JButton remCourse;
	private JButton dispOne;
	private JButton dispAll;
	private JLabel studNameLabel;
	private JLabel courseNameLabel;
	private JLabel gpaLabel;
	private JLabel cIDLabel;
	private JTextField studNameField;
	private JTextField courseNameField;
	private JTextField gpaField;
	private JTextField cIDField;
	private JTextArea dispAllArea;
	
	StudentCollection studentList = new StudentCollection();

	GridBagConstraints gbc = new GridBagConstraints();
	
	public GUI(String Title)
	{
		super(Title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		itiMainPanel();
	}
	
	private void itiMainPanel()
	{
		topPanel = new JPanel(new GridBagLayout());
		add(topPanel);
		
		gbc.insets = new Insets(5,5,5,5);
		
		studNameLabel = new JLabel("Name:");
		gbc.gridx = 0;
		gbc.gridy= 0;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		topPanel.add(studNameLabel, gbc);
		
		studNameField = new JTextField(10);
		gbc.gridx = 3;
		gbc.gridy = 0;
		topPanel.add(studNameField, gbc);
		
		addStud = new JButton("Add Student");
		gbc.gridx = 6;
		gbc.gridy = 0;
		topPanel.add(addStud, gbc); 
		
		addStud.addActionListener(this);
		
		remStud = new JButton("Remove Student");
		gbc.gridx = 9;
		gbc.gridy = 0;
		topPanel.add(remStud, gbc);
		
		remStud.addActionListener(this);
		
		courseNameLabel = new JLabel("Add Course");
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 3;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		topPanel.add(courseNameLabel, gbc);
		
		courseNameField = new JTextField("");
		gbc.gridx = 4;
		gbc.gridy = 1;
		topPanel.add(courseNameField, gbc);
		
		gpaLabel = new JLabel("GPA");
		gbc.gridx = 1;
		gbc.gridy = 2;
		topPanel.add(gpaLabel, gbc);
		
		gpaField = new JTextField();
		gbc.gridx = 4;
		gbc.gridy = 2;
		topPanel.add(gpaField, gbc);
		
		cIDLabel = new JLabel("Course ID");
		gbc.gridx = 1;
		gbc.gridy = 3;
		topPanel.add(cIDLabel, gbc);
		
		cIDField = new JTextField();
		gbc.gridx = 4;
		gbc.gridy = 3;
		topPanel.add(cIDField, gbc);
		
		JComboBox studNameList = new JComboBox();
		gbc.gridx = 7;
		gbc.gridy = 1;
		topPanel.add(studNameList, gbc);
		
		addCourse = new JButton("Add Course");
		gbc.gridx = 1;
		gbc.gridy = 4;
		topPanel.add(addCourse, gbc);
		
		addCourse.addActionListener(this);
		
		remCourse = new JButton("Remove Course");
		gbc.gridx = 4;
		gbc.gridy = 4;
		topPanel.add(remCourse, gbc);
		
		remCourse.addActionListener(this);
		
		dispAll = new JButton("Display All");
		gbc.gridx = 7;
		gbc.gridy = 4;
		topPanel.add(dispAll, gbc);
		
		dispAll.addActionListener(this);
		
		dispOne = new JButton("Display One");
		gbc.gridx = 10;
		gbc.gridy = 4;
		topPanel.add(dispOne, gbc);
		
		dispOne.addActionListener(this);
		
		dispAllArea = new  JTextArea(10,1);
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 10;
		topPanel.add(dispAllArea,gbc);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String btnName = e.getActionCommand();
		
		if(btnName.equals("Add Student"))
		{
			String studInput = studNameField.getText();
			Student student = new Student(studInput);
			
			studentList.addStudent(student);
			dispAllArea.append("Adding student: " + studInput + " to the database.\n");
		}
		
		if(btnName.equals("Remove Student"))
		{
			String studInput = studNameField.getText();
			Student student = new Student(studInput);
			
			studentList.removeStudent(student);
			dispAllArea.append("Removing student: " + studInput + " from the database.\n");
		}
		
		if(btnName.equals("Add Course"))
		{
			String studInput = studNameField.getText();
			String Course = courseNameField.getText();
			double GPA = Double.parseDouble(gpaField.getText());
			int ID = Integer.parseInt(cIDField.getText());
			Student student = new Student(studInput);
			
			Course course = new Course(ID, Course, GPA);
			CourseCollection studentCourseCollection = student.getCoursesList();
			studentCourseCollection.addFirst(course);
			dispAllArea.append("Adding: " + course + " to student: " + studInput + "\n");
		}
		
		if(btnName.equals("Remove Course"))
		{
			String studInput = studNameField.getText();
			String Course = courseNameField.getText();
			double GPA = Integer.parseInt(gpaField.getText());
			int ID = Integer.parseInt(cIDField.getText());
			Student student = new Student(studInput);
			
			Course course = new Course(ID, Course, GPA);
			CourseCollection studentCourseCollection = student.getCoursesList();
			studentCourseCollection.removeTarget(course);
			dispAllArea.append("Removing: " + course + "from " + studInput + "'s class list. \n");
		}
		
		if(btnName.equals("Display One"))
		{
			String studInput = studNameField.getText();
			Student student = studentList.searchByName(studInput);
			
			dispAllArea.append("Now displaying " + studInput + "'s course list: \n");
			dispAllArea.append("" + student.toString());
			}
	
		if(btnName.equals("Display All"))
		{
			dispAllArea.append(studentList.toString());
		}
	}
	
	public static void main(String[] ags)
	{
		GUI frame = new GUI("Century College");
		frame.pack();
		JScrollPane scrollPane = new JScrollPane(topPanel,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		frame.add(scrollPane);
		frame.setVisible(true);
	}
}