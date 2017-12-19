package View;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel{
	private static final long serialVersionUID = -1931505285368286964L;
	
	private JTextField teste;
	private GridBagConstraints testeContraints;

	public MainPanel() {
		initialize();
	}
	
	public void initialize() {
		setLayout(new GridBagLayout());
		add(getTeste(),getTesteContraints());
	}
	
	public JTextField getTeste() {
		if(teste == null) {
			teste = new JTextField("Hello");
		}
		return teste;
	}

	public GridBagConstraints getTesteContraints() {
		if(testeContraints == null) {
			testeContraints  = new GridBagConstraints();
			testeContraints.gridx = 1 ;
			testeContraints.gridy = 1;
			Insets insetes = new Insets(8, 8, 8, 8);
			testeContraints.insets = insetes;
		}
		return testeContraints;
	}

	
}
