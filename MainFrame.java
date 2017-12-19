package View;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = -1364196269001069655L;
	
	public MainFrame() {
		initialize();
	}

	private void initialize() {
		add (new MainPanel());
		setTitle("Teste");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		
	}

}
