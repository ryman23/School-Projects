package century.edu.pa1;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.text.DecimalFormat;

public class LunarGUI extends JFrame implements ActionListener, Runnable
{
	private static final long serialVersionUID = 1L;
	// Values
	private static final int WIDTH = 700;
	private static final int HEIGHT = 700;
	private int FINISH = 0;
	private int SHIP_HEIGHT;
	private final int CENTER = 240;
	
	private JPanel mainPanel;
	private LandingField landingFieldPanel;
	private JButton start;
	private Image bgPic = new ImageIcon(this.getClass().getResource("space.jpg")).getImage();
	private Image spaceShip = new ImageIcon (this.getClass().getResource("spaceShip.jpg")).getImage();
	private Image scaledSpaceShip = spaceShip.getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
	
	// Variables
	private double fuelFlow = 1;
	private double verticalSpeed; 
	private double altitude = 150;
	private double totalFuel = 150;
	private double totalFuelRemaining = totalFuel;
	private double landerMassWOFuel = 900;
	private double maxFuelConsumption = 10;
	private double maxThrust = 5000;
	private double time = .1;
	
	DecimalFormat df = new DecimalFormat("#.#");
	
	
	public LunarGUI(String title)
	{
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		
		// Make a table
		System.out.println("Distance to lunar surface:  Fuel flow rate:  Vertical speed:  Fuel remaining:  Mass without fuel: Max fuel consumption:  Max thrust: ");
		System.out.println("=====================================================================================================================================");
		
		itiMainPanelComponents();
	}

	// Initialize the components of the panels.
	private void itiMainPanelComponents()
	{
		mainPanel = new JPanel(new BorderLayout());
		landingFieldPanel = new LandingField();
		start = new JButton("Start");
		start.addActionListener(this);
		mainPanel.add(landingFieldPanel, BorderLayout.CENTER);
		mainPanel.add(start, BorderLayout.SOUTH);
		add(mainPanel);
	}
	
	// Make a second thread
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Thread t2 = new Thread(this);
		t2.start();
	}
	
	// Make thread sleep and call repaint
	@Override
	public void run()
	{
		while(true)
		{
			landingFieldPanel.repaint();
			try
			{
				Thread.sleep(100);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

	private class LandingField extends JPanel 
	{
		private static final long serialVersionUID = 1L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			g2.drawImage(bgPic, -200, -200, null);
			
			// Draw the ship's position
			drawShipPosition(g2);

			// Update the position of the ship 
			updatePosition();
		}

		// Moves ship 
		private void updatePosition() 
		{
			System.out.println("         " + df.format(altitude) + " meters          " + df.format(fuelFlow) + " kg/s         " + df.format(verticalSpeed) + " m/s           " + df.format(totalFuelRemaining) + " kg         " + landerMassWOFuel + " kg           " + df.format(maxFuelConsumption) + " kg/s          " + maxThrust + " m/s");
		
			if(totalFuelRemaining > 0 && altitude > 0)
			{

				// Calculate the vertical speed
				verticalSpeed += time *(((maxThrust * fuelFlow)/(landerMassWOFuel + totalFuelRemaining)) - 1.62 ); 
			
				// Calculate the altitude remaining
				altitude -= time * verticalSpeed;
			
				// Calculate the fuel remaining
				totalFuelRemaining -= time * fuelFlow * maxFuelConsumption;
				
				// Change the values for the GUI
				SHIP_HEIGHT = -(int) altitude;

				if(altitude <= 0)
				{
					System.out.println("You landed safely!");
					try {
						Thread.sleep(3500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.exit(0);
				}
				if(totalFuelRemaining <= 0 )
				{
					// Set values to 0 if they reach 0
					fuelFlow = 0;
					verticalSpeed = 0;
					System.out.println("You ran out of fuel! RIP");
					try {
						Thread.sleep(3500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.exit(0);
				}
		
			}
		}
		private void drawShipPosition(Graphics2D g2)
		{	
			if (altitude > FINISH) 
			{
				g2.drawImage(scaledSpaceShip, CENTER, SHIP_HEIGHT, null);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		LunarGUI frame = new LunarGUI("Lunar Lander");
		frame.setVisible(true);
	}
}