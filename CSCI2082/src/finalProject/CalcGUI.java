package finalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.regex.Pattern;

public class CalcGUI extends JFrame implements ActionListener
{
	private JPanel numberPanel;
	private JTextArea displayArea;
	private JButton num0;
	private JButton num1;
	private JButton num2;
	private JButton num3;
	private JButton num4;
	private JButton num5;
	private JButton num6;
	private JButton num7;
	private JButton num8;
	private JButton num9;
	private JButton multi;
	private JButton divide;
	private JButton add;
	private JButton sub;
	private JButton enter;
	private JButton yes;
	private JButton no;
	private JButton deci;
	private JButton lP;
	private JButton rP;
	public static final Pattern CHARACTER = Pattern.compile("\\S.*?");
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	public CalcGUI(String title)
	{
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		numPanel();
	}
	
	private void numPanel()
	{
		numberPanel = new JPanel(new GridBagLayout());
		add(numberPanel);
		
		gbc.insets = new Insets(5,5,5,5);
		
		num9 = new JButton("9");
		gbc.gridx = 0;
		gbc.gridy= 1;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(num9, gbc);
		
		num9.addActionListener(this);
		
		num8 = new JButton("8");
		gbc.gridx = 2;
		gbc.gridy= 1;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(num8, gbc);
		
		num8.addActionListener(this);
		
		num7 = new JButton("7");
		gbc.gridx = 4;
		gbc.gridy= 1;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(num7, gbc);
		
		num7.addActionListener(this);
		
		multi = new JButton("*");
		gbc.gridx = 6;
		gbc.gridy= 1;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(multi, gbc);
		
		multi.addActionListener(this);
		
		lP = new JButton("(");
		gbc.gridx = 8;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		numberPanel.add(lP, gbc);
		
		lP.addActionListener(this);
		
		num6 = new JButton("6");
		gbc.gridx = 0;
		gbc.gridy= 2;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(num6, gbc);
		
		num6.addActionListener(this);
		
		num5 = new JButton("5");
		gbc.gridx = 2;
		gbc.gridy= 2;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(num5, gbc);
		
		num5.addActionListener(this);
		
		num4 = new JButton("4");
		gbc.gridx = 4;
		gbc.gridy= 2;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(num4, gbc);
		
		num4.addActionListener(this);
		
		divide = new JButton("/");
		gbc.gridx = 6;
		gbc.gridy= 2;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(divide, gbc);
		
		divide.addActionListener(this);
		
		rP = new JButton(")");
		gbc.gridx = 8;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		numberPanel.add(rP, gbc);
		
		rP.addActionListener(this);
		
		num3 = new JButton("3");
		gbc.gridx = 0;
		gbc.gridy= 3;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(num3, gbc);
		
		num3.addActionListener(this);
		
		num2 = new JButton("2");
		gbc.gridx = 2;
		gbc.gridy= 3;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(num2, gbc);
		
		num2.addActionListener(this);
		
		num1 = new JButton("1");
		gbc.gridx = 4;
		gbc.gridy= 3;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(num1, gbc);
		
		num1.addActionListener(this);
		
		add = new JButton("+");
		gbc.gridx = 6;
		gbc.gridy= 3;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(add, gbc);
		
		add.addActionListener(this);
		
		num0 = new JButton("0");
		gbc.gridx = 2;
		gbc.gridy= 4;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(num0, gbc);
		
		num0.addActionListener(this);
		
		deci = new JButton(".");
		gbc.gridx = 0;
		gbc.gridy= 4;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(deci, gbc);
		
		deci.addActionListener(this);
		
		sub = new JButton("-");
		gbc.gridx = 6;
		gbc.gridy= 4;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(sub, gbc);
		
		sub.addActionListener(this);
		
		yes = new JButton("Yes");
		gbc.gridx = 8;
		gbc.gridy= 4;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(yes, gbc);
		
		yes.addActionListener(this);
		
		no = new JButton("No");
		gbc.gridx = 8;
		gbc.gridy= 3;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(no, gbc);
		
		no.addActionListener(this);
		
		enter = new JButton("Enter");
		gbc.gridx = 4;
		gbc.gridy= 4;
		gbc.gridwidth = 2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		numberPanel.add(enter, gbc);
		
		enter.addActionListener(this);
		
		displayArea = new JTextArea(10,5);
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 10;
		gbc.gridheight = 5;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		numberPanel.add(displayArea, gbc);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String btnName = e.getActionCommand();
		
		if(btnName.equals("9"))
		{
			displayArea.append("9");
		}
		else if(btnName.equals("8"))
		{
			displayArea.append("8");
		}
		else if(btnName.equals("7"))
		{
			displayArea.append("7");
		}
		else if(btnName.equals("6"))
		{
			displayArea.append("6");
		}
		else if(btnName.equals("5"))
		{
			displayArea.append("5");
		}
		else if(btnName.equals("4"))
		{
			displayArea.append("4");
		}
		else if(btnName.equals("3"))
		{
			displayArea.append("3");
		}
		else if(btnName.equals("2"))
		{
			displayArea.append("2");
		}
		else if(btnName.equals("1"))
		{
			displayArea.append("1");
		}
		else if(btnName.equals("0"))
		{
			displayArea.append("0");
		}
		else if(btnName.equals("+"))
		{
			displayArea.append("+");
		}
		else if(btnName.equals("-"))
		{
			displayArea.append("-");
		}
		else if(btnName.equals("*"))
		{
			displayArea.append("*");
		}
		else if(btnName.equals("/"))
		{
			displayArea.append("/");
		}
		else if(btnName.equals("."))
		{
			displayArea.append(".");
		}
		else if(btnName.equals("("))
		{
			displayArea.append("(");
		}
		else if(btnName.equals(")"))
		{
			displayArea.append(")");
		}
		else if(btnName.equals("Enter"))
		{
			String values = displayArea.getText();
			boolean isThere = false;
			
			if(values.contains("("))
			{
				isThere = true;
			}
			else
			{
				isThere = false;
				displayArea.append("\n Missing a parenthesis");
			}
			if(values.contains(")"))
			{
				isThere = true;
			}
			else
			{
				isThere = false;
				displayArea.append("\n Missing a parenthesis");
			}
			if(isThere == true)
			{
				displayArea.append("" + " = " + CalcStack.evaluate(values) + "\n");
				displayArea.append("Do another? Please click yes or no");
			}
			else
				displayArea.append("\n Missing a parenthesis");
		}
		else if(btnName.equals("No"))
		{
			System.exit(0);
		}
		else if(btnName.equals("Yes"))
		{
			displayArea.append("Clear the workspace and type a new problem");
		}
	}
	
	public static void main(String[] args)
	{
		CalcGUI frame = new CalcGUI("Calculator");
		frame.pack();
		frame.setVisible(true);
	}
}