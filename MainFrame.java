package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = -1364196269001069655L;

	private MainPanel myPanel;
	
	public MainFrame() {
		initialize();
	}

	private void initialize() {
		add (getMyPanel());
		setTitle("Name");
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		
	}

	public MainPanel getMyPanel() {
		if(myPanel == null) {
			myPanel = new MainPanel();
			// click event to my button
			myPanel.getButton().addActionListener(new ActionListener() { 
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//create the message
					String message ="Hi, "+ myPanel.getTeste().getText();
					//show the message
					JOptionPane.showMessageDialog(null, message);
					
				}
			});
		}
		return myPanel;
	}
	
	

}
