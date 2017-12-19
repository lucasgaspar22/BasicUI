package View;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel{
	private static final long serialVersionUID = -1931505285368286964L;
	
	private JLabel label;
	private JTextField nomeTextField;
	private JButton button;
	
	private GridBagConstraints testeContraints;
	private GridBagConstraints buttonContraints;
	private GridBagConstraints labelContraints;
	public MainPanel() {
		initialize();
	}
	
	public void initialize() {
		setLayout(new GridBagLayout());
		add(getTeste(),getTesteContraints());
		add(getButton(),getButtonContraints());
		add(getLabel(),getLabelContraints());
	}
	
	public JTextField getTeste() {
		if(nomeTextField == null) {
			nomeTextField = new JTextField(10);
		}
		return nomeTextField;
	}

	public JButton getButton() {
		if (button == null) {
			button = new JButton("Click");
		}
		return button;
	}

	public JLabel getLabel() {
		if (label == null) {
			label = new JLabel("What's your name? ");
		}
		return label;
	}

	public GridBagConstraints getLabelContraints() {
		if(labelContraints == null) {
			labelContraints  = new GridBagConstraints();
			labelContraints.gridx = 1 ;
			labelContraints.gridy = 1;
			Insets insetes = new Insets(8, 8, 8, 8);
			labelContraints.insets = insetes;
		}
		return labelContraints;
	}

	public GridBagConstraints getButtonContraints() {
		if(buttonContraints == null) {
			buttonContraints  = new GridBagConstraints();
			buttonContraints.gridx = 2 ;
			buttonContraints.gridy = 2;
			Insets insetes = new Insets(8, 8, 8, 8);
			buttonContraints.insets = insetes;
		}
		return buttonContraints;
	}

	public GridBagConstraints getTesteContraints() {
		if(testeContraints == null) {
			testeContraints  = new GridBagConstraints();
			testeContraints.gridx = 2;
			testeContraints.gridy = 1;
			Insets insetes = new Insets(8, 8, 8, 8);
			testeContraints.insets = insetes;
		}
		return testeContraints;
	}

	
}
