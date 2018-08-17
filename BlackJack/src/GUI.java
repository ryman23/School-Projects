import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GUI extends JFrame {
	// GUI Interface
	private JLabel player1;
	private JLabel player2;
	private JLabel player3;
	private JLabel dealer;
	
	// Constructor
	public GUI(){
		super("BlackJack");
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.LINE_START;
			
		player1 = new JLabel("Player1");
		JButton p1H = new JButton("Hit");
		JButton p1S = new JButton("Stand");
		player1.setToolTipText("I'm Player1!");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(p1H, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		add(p1S, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 4;
		add(player1, gbc);
		
		player2 = new JLabel("Player2");
		JButton p2H = new JButton("Hit");
		JButton p2S = new JButton("Stand");
		player2.setToolTipText("I'm Player2!");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		add(p2H, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		add(p2S, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 4;
		add(player2, gbc);	
		
		player3 = new JLabel("Player3");
		JButton p3H = new JButton("Hit");
		JButton p3S = new JButton("Stand");
		player3.setToolTipText("I'm Player3!");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 2;
		add(p3H, gbc);
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 2;
		add(p3S,gbc);
		add(player3);	
		
		dealer = new JLabel("Dealer");
		dealer.setToolTipText("I'm the dealer");
		add(dealer);
		
	}
}