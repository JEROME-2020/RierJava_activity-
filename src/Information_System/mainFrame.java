package Information_System;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class mainFrame extends JFrame {
	
	Panel panel = new Panel();
	
	public mainFrame(){
		setBounds(280, 100, 900, 600);
		setResizable(false); 
		setVisible(true);
		setTitle("Information System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel, BorderLayout.WEST);
		setLocationRelativeTo(null);
	
	}
}
